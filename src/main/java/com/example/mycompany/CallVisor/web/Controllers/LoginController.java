package com.example.mycompany.CallVisor.web.Controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User2 on 25.08.2018.
 */

@Controller
public class LoginController {
    private static Logger logger = Logger.getLogger(LoginController.class);

    @GetMapping("/login")
    public String login(HttpServletRequest request) {
        logger.trace("Authorization from IP " + getClientIp(request)
                + ". Device type: " + (isClientDeviceMobile(request) ? "mobile phone" : "PC"));
        return "login";
    }

    private static String getClientIp(HttpServletRequest request) {
        String remoteAddr = "";
        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }
        return remoteAddr;
    }

    private boolean isClientDeviceMobile(HttpServletRequest req) {
        return req.getHeader("User-Agent").contains("Mobile");
    }
}
