package com.example.mycompany.CallVisor.web.Controllers;

import com.example.mycompany.CallVisor.persistence.SQLServerHandler;
import com.example.mycompany.CallVisor.persistence.entities.ManagerEntity;
import com.example.mycompany.CallVisor.web.security.WebSecurityConfig;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by User2 on 25.08.2018.
 */

@Controller
public class LoginController {
    private static SQLServerHandler sqlHandler = SQLServerHandler.getInstance();
    private static Logger logger = Logger.getLogger(LoginController.class);

    @GetMapping("/login")
    public String login(HttpServletRequest request) {
        logger.trace("Authorization page entry from IP " + getClientIp(request)
                + ". Device type: " + (isClientDeviceMobile(request) ? "mobile phone" : "PC"));
        return "login";
    }

    @PostMapping("/login")
    public void auth(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("username");
        String password = req.getParameter("password");
        if (isAuthDataValid(login, password)) {
            int admintype = sqlHandler.getManagerByLogin(login).getAdmintype();
            HttpSession session = req.getSession();
            synchronized (session) {
                session.setAttribute("login", login);
                session.setAttribute("role", WebSecurityConfig.Role.getRole(admintype));
            }
            logger.trace("Successful authorization attempt from IP " + getClientIp(req)
                    + ". Login: " + login
                    + ". Device type: " + (isClientDeviceMobile(req) ? "mobile phone" : "PC"));
            resp.sendRedirect(req.getContextPath() + "/");
        } else {
            logger.trace("Failed authorization attempt from IP " + getClientIp(req)
                    + ". Login: " + login
                    + ". Device type: " + (isClientDeviceMobile(req) ? "mobile phone" : "PC"));
            resp.sendRedirect("/login?error");
        }
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        logger.trace("Authorization page entry from IP " + getClientIp(request)
                + ". Device type: " + (isClientDeviceMobile(request) ? "mobile phone" : "PC"));
        request.getSession().setAttribute("login", null);
        resp.sendRedirect("/login?");
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

    public static String hash(String s) {
        return DigestUtils.sha256Hex(s);
    }

    private boolean isAuthDataValid(String login, String password) {
        ManagerEntity managerEntity = sqlHandler.getManagerByLogin(login);
        return managerEntity != null && managerEntity.getDopInfo().equals(hash(password));
    }
}
