package com.example.mycompany.CallVisor.logic;

import com.example.mycompany.CallVisor.logic.util.PropertiesManager;
import com.example.mycompany.CallVisor.logic.util.CallDescription;
import org.apache.log4j.Logger;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created by User2 on 20.08.2018.
 */
public class EmailHandler {
    private static EmailHandler instance;
    private Session session;
    private static Logger logger;
    private String mailLogin, mailPass, enableSmtpAuth, smtpServer, smtpPort, prefix, postfix;

    private EmailHandler() {
        logger = Logger.getLogger(EmailHandler.class);
        PropertiesManager manager = PropertiesManager.getInstance();
        mailLogin = manager.getProperty("mailLogin");
        mailPass = manager.getProperty("mailPass");
        enableSmtpAuth = manager.getProperty("enableSmtpAuth");
        smtpServer = manager.getProperty("smtpServer");
        smtpPort = manager.getProperty("smtpPort");
        prefix = manager.getProperty("mailPrefix") + System.lineSeparator() + System.lineSeparator();
        postfix = System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + manager.getProperty("mailPostfix");
    }

    public static EmailHandler getInstance() {
        if (instance == null) instance = new EmailHandler();
        return instance;
    }

    private Session getSession() {
        if (session == null) {
            session = openSession();
        }
        return session;
    }

    private Session openSession() {
        logger.trace("SSLEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", smtpServer);
        props.put("mail.smtp.socketFactory.port", smtpPort);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", enableSmtpAuth);
        props.put("mail.smtp.port", smtpPort);

        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mailLogin, mailPass);
            }
        };

        Session session = Session.getDefaultInstance(props, auth);
        logger.trace("Session created");
        return session;
    }

    public void sendNotification(InternetAddress[] emails, String subject, CallDescription callDesc) {
        sendNotification(emails, subject, callDesc.toString());
    }

    public void sendNotification(InternetAddress[] emails, String subject, String text) {
        if (emails != null) {
            try {
                MimeMessage msg = new MimeMessage(getSession());

                msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
                msg.addHeader("format", "flowed");
                msg.addHeader("Content-Transfer-Encoding", "8bit");

                msg.setFrom(new InternetAddress(mailLogin));
                msg.setReplyTo(InternetAddress.parse(mailLogin, false));
                msg.setSubject(subject, "UTF-8");
                msg.setText(prefix + text + postfix, "UTF-8");
                msg.setSentDate(new Date());
                msg.setRecipients(Message.RecipientType.TO, emails);

                logger.trace("Message is ready");
                Transport.send(msg);

                logger.trace("EMail Sent Successfully");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

