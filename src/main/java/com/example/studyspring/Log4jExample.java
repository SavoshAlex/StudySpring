package com.example.studyspring;

import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * For execute this class:
 * mvn clean:clean install
 * mvn exec:java -Dexec.mainClass=com.example.studyspring.Log4jExample
 * @author user
 */
public class Log4jExample {
    
    private final static Logger LOG = Logger.getLogger(Log4jExample.class);
    
    public static void main(String[] args) {
        LOG.info("Hello world");
    }
    
}
