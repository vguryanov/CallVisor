package com.example.mycompany.CallVisor.persistence;

import com.example.mycompany.CallVisor.logic.util.PropertiesManager;
import com.example.mycompany.CallVisor.persistence.entities.*;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.PersistenceException;
import java.util.*;

/**
 * Created by User2 on 19.08.2018.
 */
public class SQLServerHandler {
    private static SQLServerHandler instance;
    private static SessionFactory ourSessionFactory;
    private static Session session;
    private String dbUrl, dbLogin, dbPass;
    private static Logger logger;

    private SQLServerHandler() {
        logger = Logger.getLogger(SQLServerHandler.class);
        PropertiesManager manager = PropertiesManager.getInstance();
        dbUrl = manager.getProperty("dbUrl");
        dbLogin = manager.getProperty("dbLogin");
        dbPass = manager.getProperty("dbPass");
    }

    public static SQLServerHandler getInstance() {
        if (instance == null) instance = new SQLServerHandler();
        return instance;
    }

    private Session getSession() throws HibernateException {
        if (session == null) {
            try {
                Configuration configuration = new Configuration();
                configuration.configure();

                configuration.setProperty("hibernate.connection.url", dbUrl);
                configuration.setProperty("hibernate.connection.username", dbLogin);
                configuration.setProperty("hibernate.connection.password", dbPass);

                ourSessionFactory = configuration.buildSessionFactory();
                session = ourSessionFactory.openSession();
            } catch (Throwable ex) {
                logger.error("Cannot establish connection with database", ex);
            }
        }
        return session;
    }

    private List getQueryResultList(Query query) {
        List result = null;
        while (result == null) {
            try {
                logger.trace("Starting query execution: " + query.getQueryString());
                result = query.list();
            } catch (PersistenceException e) {
                logger.error("Cannot execute query: " + query.getQueryString(), e);
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return result;
    }

    public KlientinfoEntity getClientById(String id) {
        String hqlQuery = "FROM KlientinfoEntity WHERE id = :id";

        Query query = getSession().createQuery(hqlQuery);
        query.setParameter("id", id);

        List<KlientinfoEntity> result = getQueryResultList(query);
        return result.size() > 0 ? result.get(0) : null;
    }

    public KlienthistoryEntity getLastRequestByClientID(String id) {
        String hqlQuery = "FROM KlienthistoryEntity WHERE idKlient = :id " +
                "order by dateTimeStart desc";

        Query query = getSession().createQuery(hqlQuery);
        query.setParameter("id", id);

        List<KlienthistoryEntity> result = getQueryResultList(query);
        return result.size() > 0 ? result.get(0) : null;
    }

    public ManagerEntity getManagerByID(String id) {
        String hqlQuery = "FROM ManagerEntity WHERE id = :id";

        Query query = getSession().createQuery(hqlQuery);
        query.setParameter("id", id);

        List<ManagerEntity> result = getQueryResultList(query);
        return result.size() > 0 ? result.get(0) : null;
    }

    public TelephonNumberEntity getTelephonNumberEntityById(String id) {
        String hqlQuery = "FROM TelephonNumberEntity WHERE id = :id";

        Query query = getSession().createQuery(hqlQuery);
        query.setParameter("id", id);

        List<TelephonNumberEntity> result = getQueryResultList(query);
        return result.size() > 0 ? result.get(0) : null;
    }

    public List<CallEntity> getMissedCallsAfter(Date date) {
        List<CallEntity> result = new LinkedList<>();

        String hqlQuery = "FROM CallEntity " +
                "WHERE callDate > :date " +
                "AND action like :action " +
                "order by callDate";

        Query query = getSession().createQuery(hqlQuery);
        query.setParameter("date", date);
        query.setParameter("action", "%пропущен2%");

        result.addAll(getQueryResultList(query));
        return result;
    }

    public List<CallEntity> getMissedCallsForPeriod(Date startDate, Date endDate) {
        List<CallEntity> result = new LinkedList<>();

        String hqlQuery = "FROM CallEntity " +
                "WHERE callDate BETWEEN :startDate AND :endDate " +
                "AND action like :action " +
                "order by callDate";

        Query query = getSession().createQuery(hqlQuery);
        query.setParameter("startDate", startDate);
        query.setParameter("endDate", endDate);
        query.setParameter("action", "%пропущен2%");

        result.addAll(getQueryResultList(query));
        return result;
    }
}
