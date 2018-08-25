package com.example.mycompany.CallVisor.logic;

import com.example.mycompany.CallVisor.logic.util.PropertiesManager;
import com.example.mycompany.CallVisor.persistence.CallDescription;
import com.example.mycompany.CallVisor.persistence.entities.CallEntity;
import com.example.mycompany.CallVisor.persistence.SQLServerHandler;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Date;
import java.util.List;

/**
 * Created by User2 on 21.08.2018.
 */
public class MissedCallVisorService extends Thread {
    private EmailHandler emailHandler;
    private SQLServerHandler dbHandler;
    private Date lastCallDate = new Date();
    private final InternetAddress[] emailNotificationRecipients;
    private final String notificationSubject = "Новый пропущенный звонок";
    private PropertiesManager manager = PropertiesManager.getInstance();

    public MissedCallVisorService(EmailHandler emailHandler, SQLServerHandler dbHandler) throws AddressException {
        this.emailHandler = emailHandler;
        this.dbHandler = dbHandler;
        emailNotificationRecipients = InternetAddress.parse(manager.getProperty("MCVSNRecipients"), true);
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            List<CallEntity> calls = dbHandler.getMissedCallsAfter(lastCallDate);
            if (!calls.isEmpty()) {
                calls.forEach(c -> {
                    if (c.getCallDate().after(lastCallDate)) {
                        emailHandler.sendNotification(emailNotificationRecipients, notificationSubject, new CallDescription(c));
                        lastCallDate = c.getCallDate();
                    }
                });
            }
            try {
                Thread.currentThread().sleep(30 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
