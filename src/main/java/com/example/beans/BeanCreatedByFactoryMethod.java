package com.example.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.apache.log4j.Logger;


public class BeanCreatedByFactoryMethod implements Bean {
    
    private final static Logger LOG = Logger.getLogger(BeanCreatedByFactoryMethod.class);
    private static BeanCreatedByFactoryMethod bean = new BeanCreatedByFactoryMethod();
    
    public static BeanCreatedByFactoryMethod createInstance(){
        return bean;
    }
    
    private String name;
    
    private BeanCreatedByFactoryMethod(){
        name = "BeanCreatedByFactoryMethod";
    }
    
    public String getName() {
        return name;
    }
}
