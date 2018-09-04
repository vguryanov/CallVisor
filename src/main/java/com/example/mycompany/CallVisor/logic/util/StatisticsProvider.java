package com.example.mycompany.CallVisor.logic.util;

import com.example.mycompany.CallVisor.persistence.SQLServerHandler;
import org.apache.commons.lang3.time.DateUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by User2 on 30.08.2018.
 */
public class StatisticsProvider {
    private static SQLServerHandler sqlHandler = SQLServerHandler.getInstance();

    public static List<DayCallsStats> getDailyCallSumStatsForPeriod(Date start, Date end) {
        List<DayCallsStats> result = new ArrayList<>();

        sqlHandler.getDailyCallSumStatsForPeriod(start, end).forEach(s -> {
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

    public static List<Object[]> getMissedProcessStatisticsForPeriod(Date start, Date end) {
        return sqlHandler.getMissedCallsProcStatistics(start, end).stream()
                .map(o -> {
                    return new Object[]{
                            String.valueOf(o[2]) + "." + String.valueOf(o[1]) + "." + String.valueOf(o[0]).substring(2, 4),
                            o[3],
                            o[4],
                            o[5],
                            o[6],
                            o[7],
                            o[8],
                            o[9],
                            o[10],
                            o[11]
                    };
                }).collect(Collectors.toList());
    }

    public static DayCallsStats getDailyCallSumStatsForDate(Date date) {
        date = DateUtils.truncate(date, Calendar.DATE);
        return getDailyCallSumStatsForPeriod(date, new Date(date.getTime() + 24 * 3600000 - 1)).get(0);
    }

    public static List<Object[]> getDailyAverageMissedCallProcSpeedStatistic(Date start, Date end){
        return sqlHandler.getDailyAverageMissedCallProcSpeedStatistic(start, end).stream()
                .map(o -> {
                    return new Object[]{
                            String.valueOf(o[2]) + "." + String.valueOf(o[1]) + "." + String.valueOf(o[0]).substring(2, 4),
                            (Integer) o[3]/3600
                    };
                }).collect(Collectors.toList());
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
