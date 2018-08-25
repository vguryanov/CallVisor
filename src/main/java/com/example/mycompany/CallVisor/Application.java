package com.example.mycompany.CallVisor;

import com.example.mycompany.CallVisor.logic.EmailHandler;
import com.example.mycompany.CallVisor.logic.MissedCallVisorService;
import com.example.mycompany.CallVisor.persistence.SQLServerHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.internet.AddressException;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        try {
            MissedCallVisorService mcvs = new MissedCallVisorService(
                    EmailHandler.getInstance(),
                    SQLServerHandler.getInstance()
            );
            mcvs.start();
        } catch (AddressException e) {
            e.printStackTrace();
        }
    }
}
