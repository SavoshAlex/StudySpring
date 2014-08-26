package com.example.studyspring;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ShutdownApplicationContext {
    
    private final static Logger LOG = Logger.getLogger(ShutdownApplicationContext.class);
    
    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
        ctx.registerShutdownHook();
        LOG.info("w a i t");
        Thread.sleep(2000);
        
        
        
        
        
    }
    
    
}
