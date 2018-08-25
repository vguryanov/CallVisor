package com.example.mycompany.CallVisor.logic.util;

import java.io.File;
import java.io.IOException;

/**
 * Created by User2 on 21.08.2018.
 */
public class LogUtil {  //TODO discontinue?
    private final static String logFilePath = "C:\\ProgramData\\CallVisor\\log\\log.html";

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

    public static String getLogFilePath() {
        return logFilePath;
    }
}
