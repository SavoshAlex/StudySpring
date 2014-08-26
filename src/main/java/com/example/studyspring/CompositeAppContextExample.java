package com.example.studyspring;

import com.example.beans.Bean;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CompositeAppContextExample {
    
    private final static Logger LOG = Logger.getLogger(CompositeAppContextExample.class);
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("compositeContext.xml");
        Bean bean = (Bean) context.getBean("simpleBean");
        LOG.info("Bean name is " +  bean.getName());
        
        
        
    }
    
    
    
}
