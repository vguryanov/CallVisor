package com.example.mycompany.CallVisor.logic.util;

import com.example.mycompany.CallVisor.persistence.SQLServerHandler;
import com.example.mycompany.CallVisor.persistence.entities.*;

import java.util.Date;

/**
 * Created by User2 on 21.08.2018.
 */
public class CallDescription {
    private SQLServerHandler dbHandler;
    private String clientPhoneNumber, sourceNumber, clientName, recipientManagerName;
    private StatisticsProvider.DayCallsStats stats;

    public CallDescription(CallEntity callEntity) {
        dbHandler = SQLServerHandler.getInstance();
        sourceNumber = callEntity.getDopInfo();
        TelephonNumberEntity t = dbHandler.getTelephonNumberEntityById(callEntity.getParentId());
        clientPhoneNumber = t.getNumber();
        System.out.println(clientPhoneNumber);
        KlientinfoEntity k = dbHandler.getClientById(t.getParentId());
        if (k == null) {
            clientName = "Новый клиент";
        } else {
            clientName = k.getFamaly() + " " + k.getName() + " " + k.getPatronymic();
            if (clientName.replace(" ", "").isEmpty()) clientName = "Новый клиент";

            KlienthistoryEntity lastRequest = dbHandler.getLastRequestByClientID(k.getId());
            if (lastRequest != null) {
                ManagerEntity m = dbHandler.getManagerByID(
                        lastRequest.getIdManager()
                );
                recipientManagerName = m.getFio();
            }
        }
        this.stats = StatisticsProvider.getDailyCallSumStatsForDate(new Date());
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public String getRecipientManagerName() {
        return recipientManagerName;
    }

    @Override
    public String toString() {
        return getClientName() + " пытался(-лась) позвонить с номера " + getClientPhoneNumber() + " на номер " + sourceNumber + "." + System.lineSeparator()
                + (recipientManagerName != null ? "Сотрудник, которому предположительно был адресован звонок - " + getRecipientManagerName() + "." : "") + System.lineSeparator()
                + System.lineSeparator()
                + "Всего входящих за сегодня: " + stats.getAllIncoming()
                + "; из них пропущено: " + stats.getMissed()
                + "; из них от новых клиентов: " + stats.getMissedFromNewClient() + ".";
    }
}
