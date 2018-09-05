package com.example.mycompany.CallVisor.web.Controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User2 on 05.09.2018.
 */

@Controller
public class CustomErrorController implements ErrorController{
    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String handleError(HttpServletRequest req) {
        return "errorPage";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
