package com.example.mycompany.CallVisor;

import com.example.mycompany.CallVisor.logic.EmailHandler;
import com.example.mycompany.CallVisor.logic.MissedCallVisorService;
import com.example.mycompany.CallVisor.persistence.SQLServerHandler;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import javax.mail.internet.AddressException;

@SpringBootApplication
public class Application {
    private static final Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        logger.trace("Application start");
        SpringApplication.run(Application.class, args);
    }
}
