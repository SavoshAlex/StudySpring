package com.example.studyspring;

import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DependsOnExample {
    private final static Logger LOG = Logger.getLogger(DependsOnExample.class);
    
    public static class BeanOne{
        public BeanOne() {
            LOG.info("BeanOne init");
            }    
    }
    public static class BeanTwo{
        public BeanTwo() {
            LOG.info("BeanTwo init");
        }    
    }
    public static class BeanThree{
        public BeanThree() {
            LOG.info("BeanThree init");
        }    
    }

    public DependsOnExample() {
        LOG.info("DependsOnExample init");
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"DependsOn.xml"});
    }
}
