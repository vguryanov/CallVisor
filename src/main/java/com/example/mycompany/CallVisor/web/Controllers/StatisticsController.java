package com.example.mycompany.CallVisor.web.Controllers;

import com.example.mycompany.CallVisor.logic.util.StatisticsProvider;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by User2 on 01.09.2018.
 */
@Controller
public class StatisticsController {
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @GetMapping("/dailyCallSumStats")
    public String getStatistics(HttpServletRequest req, Model model) {
        Date[] dates = getDatesFromRequest(req);
        List<StatisticsProvider.DayCallsStats> callsStats = StatisticsProvider.getDailyCallSumStatsForPeriod(dates[0], dates[1]);
        model.addAttribute("callCountStats", callsStats);
        req.setAttribute("startDate", format.format(dates[0]));
        req.setAttribute("endDate", format.format(dates[1]));
        return "dailyCallSumStats";
    }

    @GetMapping("/missedProcStats")
    public String getMissedProcStats(HttpServletRequest req, Model model) {
        Date[] dates = getDatesFromRequest(req);
        List<Object[]> callsStats = StatisticsProvider.getMissedProcessStatisticsForPeriod(dates[0], dates[1]);
        model.addAttribute("callCountStats", callsStats);

        List<Object[]> callsStats2 = StatisticsProvider.getDailyAverageMissedCallProcSpeedStatistic(dates[0], dates[1]);
        model.addAttribute("callCountStats2", callsStats2);

        req.setAttribute("startDate", format.format(dates[0]));
        req.setAttribute("endDate", format.format(dates[1]));
        return "missedProcStats";
    }

    private static Date[] getDatesFromRequest(HttpServletRequest req) {
        String dateStartInp = req.getParameter("dateStartInp");
        String dateEndInp = req.getParameter("dateEndInp");

        Date start = null;
        Date end = null;

        if (dateStartInp != null && dateEndInp != null) {
            try {
                start = format.parse(dateStartInp);
                end = format.parse(dateEndInp);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        if (start == null || dateStartInp.equals("") || end == null || dateEndInp.equals("")) {
            end = DateUtils.truncate(new Date(), Calendar.DATE);
            start = new Date(end.getTime() - 7 * 24 * 3600000);
        }

        end.setTime(end.getTime() + 24 * 3600000 - 1);
        return new Date[]{start, end};
    }
}
