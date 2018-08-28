package com.example.mycompany.CallVisor.web.Controllers;

import com.example.mycompany.CallVisor.logic.MissedCallVisorService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User2 on 26.08.2018.
 */
@Controller
public class MissedCallsController {
    private static Logger logger = Logger.getLogger(MissedCallsController.class);

    @GetMapping("/missedcalls")
    public String missedCalls(HttpServletRequest req) {
        req.setAttribute("mcvsIsRunning", MissedCallVisorService.isRunning());
        return "missedcalls";
    }

    @GetMapping("/missedcalls/toggle")
    public void toggle(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.trace("MCVS status toggle by user " + req.getSession().getAttribute("login"));
        if (MissedCallVisorService.isRunning()) MissedCallVisorService.pause();
        else MissedCallVisorService.startup();
        resp.sendRedirect("/missedcalls");
    }
}
