package com.example.mycompany.CallVisor.logic.util;

import com.example.mycompany.CallVisor.persistence.SQLServerHandler;
import org.apache.commons.lang3.time.DateUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by User2 on 30.08.2018.
 */
public class StatisticsProvider {
    private static SQLServerHandler sqlHandler = SQLServerHandler.getInstance();

    public static List<DayCallsStats> getCallCountStatisticsForPeriod(Date start, Date end) {
        List<DayCallsStats> result = new ArrayList<>();

        sqlHandler.getCallCountStatistic(start, end).forEach(s -> {
            StringBuilder date = new StringBuilder();
            date.append((int) s[2]).append(".").append((int) s[1]).append(".").append((int) s[0] - 2000);
            result.add(
                    new DayCallsStats(
                            date.toString(),
                            (int) s[3],
                            (int) s[4],
                            (int) s[5]
                    )
            );
        });

        return result;
    }

    public static List<DayCallsStats> getCallCountStatisticsForDate(Date date) {
        date = DateUtils.truncate(date, Calendar.DATE);
        return getCallCountStatisticsForPeriod(date, new Date(date.getTime() + 24 * 3600000 - 1));
    }

    public static class DayCallsStats {
        String date;
        long allIncoming, missed, missedFromNewClient;

        public DayCallsStats(String date, long incoming, long missed, long missedFromNewClient) {
            this.date = date;
            this.allIncoming = incoming + missed;
            this.missed = missed;
            this.missedFromNewClient = missedFromNewClient;
        }

        public String getDate() {
            return date;
        }

        public long getAllIncoming() {
            return allIncoming;
        }

        public long getMissed() {
            return missed;
        }

        public long getMissedFromNewClient() {
            return missedFromNewClient;
        }

        @Override
        public String toString() {
            return date + " : " + allIncoming + " : " + missed;
        }
    }
}
