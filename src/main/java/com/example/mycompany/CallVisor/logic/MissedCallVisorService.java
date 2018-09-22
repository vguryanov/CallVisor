package com.example.mycompany.CallVisor.logic;

import com.example.mycompany.CallVisor.logic.util.PropertiesManager;
import com.example.mycompany.CallVisor.logic.util.CallDescription;
import com.example.mycompany.CallVisor.persistence.entities.CallEntity;
import com.example.mycompany.CallVisor.persistence.SQLServerHandler;
import org.apache.log4j.Logger;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Date;
import java.util.List;

/**
 * Created by User2 on 21.08.2018.
 */
public class MissedCallVisorService extends Thread {
    private static MissedCallVisorService instance;
    private boolean isRunning;
    private EmailHandler emailHandler;
    private SQLServerHandler dbHandler;
    private Date lastCallDate = new Date();
    private InternetAddress[] emailNotificationRecipients;
    private final String notificationSubject = "Новый пропущенный звонок";
    private PropertiesManager manager = PropertiesManager.getInstance();
    private static Logger logger = Logger.getLogger(MissedCallVisorService.class);

    static {
        try {
            instance = new MissedCallVisorService();
        } catch (AddressException e) {
            e.printStackTrace();
        }
    }

    private MissedCallVisorService() throws AddressException {
        isRunning = false;
        this.emailHandler = EmailHandler.getInstance();
        this.dbHandler = SQLServerHandler.getInstance();
        emailNotificationRecipients = InternetAddress.parse(manager.getProperty("MCVSNRecipients"), true);
    }

    public static void startup() {
        logger.trace("Starting MCVS");
        instance.isRunning = true;
        if (!instance.isAlive()) instance.start();
    }

    public static void pause() {
        logger.trace("Pausing MCVS");
        instance.isRunning = false;
    }

    public static boolean isRunning() {
        return instance.isRunning;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            if (isRunning) {
                List<CallEntity> calls = dbHandler.getMissedCallsAfter(lastCallDate);
                if (!calls.isEmpty()) {
                    calls.forEach(c -> {
                        if (c.getCallDate().after(lastCallDate)) {
                            emailHandler.sendNotification(emailNotificationRecipients, notificationSubject, new CallDescription(c));
                            lastCallDate = c.getCallDate();
                        }
                    });
                }
            }
            try {
                Thread.currentThread().sleep(30 * 1000);
            } catch (InterruptedException e) {
                logger.error("InterruptedException during MCVS timeout", e);
            }
        }
    }
}
