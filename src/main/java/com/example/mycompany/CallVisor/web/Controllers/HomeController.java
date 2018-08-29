package com.example.mycompany.CallVisor.web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User2 on 26.08.2018.
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String index(HttpServletRequest req) {
        return "home";
    }
}
