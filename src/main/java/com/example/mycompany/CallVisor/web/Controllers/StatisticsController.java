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

    @GetMapping("/statistics")
    public String getStatistics(HttpServletRequest req, Model model) {
        String dateStartInp = req.getParameter("dateStartInp");
        String dateEndInp = req.getParameter("dateEndInp");

        Date start = null;
        Date end = null;

        try {
            start = format.parse(dateStartInp);
            end = format.parse(dateEndInp);
        } catch (ParseException | NullPointerException e) {
            e.printStackTrace();
        }

        if (start == null || dateStartInp.equals("") || end == null || dateEndInp.equals("")) {
            end = DateUtils.truncate(new Date(), Calendar.DATE);
            start = new Date(end.getTime() - 7 * 24 * 3600000);
        }

        end.setTime(end.getTime() + 24 * 3600000 - 1);
        List<StatisticsProvider.DayCallsStats> callsStats = StatisticsProvider.getCallCountStatisticsForPeriod(start, end);
        model.addAttribute("callCountStats", callsStats);
        req.setAttribute("startDate", format.format(start));
        req.setAttribute("endDate", format.format(end));
        return "statistics";
    }
}
