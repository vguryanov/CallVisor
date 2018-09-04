package com.example.mycompany.CallVisor.web.security;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

import static com.example.mycompany.CallVisor.web.security.WebSecurityConfig.Role;

/**
 * Created by User2 on 04.09.2018.
 */
public class RoleSecurityFilter extends GenericFilterBean {
    private static Map<Role, List<String>> accessRegistry = new HashMap<>();

    static {
        accessRegistry.put(
                Role.USER,
                Arrays.asList("/statistics", "/missedProcStats")
        );
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        Role role = (Role) req.getSession().getAttribute("role");
        String servletPath = req.getServletPath();
        System.out.println(servletPath);

        if (servletPath.equals("/login")
                || servletPath.equals("/")
                || servletPath.equals("/error")
                || servletPath.equals("/logout")
                || servletPath.equals("/favicon.ico")
                || role == Role.ADMIN
                || accessRegistry.get(role).contains(servletPath))
            filterChain.doFilter(req, servletResponse);
        else
            ((HttpServletResponse) servletResponse).sendRedirect(req.getContextPath() + "/");
    }
}
