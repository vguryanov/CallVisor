package com.example.mycompany.CallVisor.web.Controllers;

import com.example.mycompany.CallVisor.logic.util.LogUtil;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Created by User2 on 25.08.2018.
 */
@RestController
public class LogController {
    @RequestMapping("/log")
    public String log() {
        FileSystemResource resource = new FileSystemResource(LogUtil.getLogFilePath());
        try {
            return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
