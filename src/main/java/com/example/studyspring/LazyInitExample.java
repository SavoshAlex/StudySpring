package com.example.studyspring;

import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LazyInitExample {
    
    private final static Logger LOG = Logger.getLogger(LazyInitExample.class);
    
    public static class LazyBean {
        public LazyBean() {
            LOG.info("LazyBean init");
        }
        
        public void init(){
            LOG.info("init method");
        }
        
        public void cleanup(){
            LOG.info("cleanup");
        }
    }
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"LazyInit.xml"});
        LOG.info("App context arise");
        try {
            LOG.info("Sleep 2 sec");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(LazyInitExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        context.getBean(LazyBean.class);
        ((ConfigurableApplicationContext)context).close();
    }
    
}
