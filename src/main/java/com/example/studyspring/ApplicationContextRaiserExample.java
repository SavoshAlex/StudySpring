package com.example.studyspring;

import com.example.beans.Bean;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationContextRaiserExample {
    
    private final static Logger LOG = Logger.getLogger(ApplicationContextRaiserExample.class); 
    
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
        Bean bean = (Bean) context.getBean("simpleBean");
        LOG.info("Bean name is " +  bean.getName());
        
        Bean beanCreatedByFactoryMethod = (Bean) context.getBean("createdByFactoryMethodBean");
        LOG.info("Bean name is " +  beanCreatedByFactoryMethod.getName());
        
        Bean someBean = (Bean) context.getBean("someBean");
        LOG.info("Bean name is " +  someBean.getName());
        
        ((ConfigurableApplicationContext)context).close();
        
    }
}
