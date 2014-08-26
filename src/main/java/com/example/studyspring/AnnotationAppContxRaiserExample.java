package com.example.studyspring;

import com.example.beans.Bean;
import com.example.beans.SimpleBean;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationAppContxRaiserExample {
        
    private final static Logger LOG = Logger.getLogger(AnnotationAppContxRaiserExample.class);
    
    public static void main(String[] args) {
        ApplicationContext contx = new AnnotationConfigApplicationContext(SimpleBean.class);
        Bean bean = contx.getBean(Bean.class);
        LOG.info("bean name: " + bean.getName());
    }
    
    
}
