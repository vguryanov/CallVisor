package com.example.mycompany.CallVisor.logic;

import java.io.File;
import java.io.IOException;

/**
 * Created by User2 on 21.08.2018.
 */
public class LogUtil {
    private final static String logFilePath = "C:\\ProgramData\\CallVisor\\log\\log4j-application.log";

    public static void init() {
        File logFile = new File(logFilePath);
        if (!logFile.exists()) {
            logFile.getParentFile().mkdirs();
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
