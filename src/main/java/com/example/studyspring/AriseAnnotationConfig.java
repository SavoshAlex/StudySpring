package com.example.studyspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class AriseAnnotationConfig {
    
    @Component
    public static class AnnoBean {
    
    }
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
        
        
        
    }
}
