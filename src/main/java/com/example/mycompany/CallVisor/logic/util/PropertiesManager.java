package com.example.mycompany.CallVisor.logic.util;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by User2 on 21.08.2018.
 */
public class PropertiesManager {
    private static Properties properties;
    private static PropertiesManager INSTANCE;
    private static final String propsFilePath = "C:\\ProgramData\\CallVisor\\util.properties";
    private boolean isLoaded = false;
    private static Logger logger = Logger.getLogger(PropertiesManager.class);

    private PropertiesManager() {
        init();
    }

    public static PropertiesManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PropertiesManager();
        }
        return INSTANCE;
    }

    public void init() {
        File propertiesFile = new File(propsFilePath);
        properties = new Properties();
        try (InputStream input = new FileInputStream(propertiesFile)) {
            properties.loadFromXML(input);
            isLoaded = true;
        } catch (IOException ex) {
            logger.fatal("Cannot load util.properties", ex);
        }
    }

    public String getProperty(String s) {
        return properties.getProperty(s);
    }
}
