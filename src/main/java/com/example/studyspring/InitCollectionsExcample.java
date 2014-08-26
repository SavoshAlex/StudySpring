package com.example.studyspring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InitCollectionsExcample {
    
    private final static Logger LOG = Logger.getLogger(InitCollectionsExcample.class);
    
    private Properties someProps;
    private List someList;
    private Map someMap;
    private Set someSet;

    public void setSomeProps(Properties someProps) {
        this.someProps = someProps;
    }

    public void setSomeList(List someList) {
        this.someList = someList;
    }

    public void setSomeMap(Map someMap) {
        this.someMap = someMap;
    }

    public void setSomeSet(Set someSet) {
        this.someSet = someSet;
    }

//    public void init(){
//        LOG.info("call init method");
//    }
    
    public void destroy(){
        LOG.info("call destroy method");
    }
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"initCollections.xml"});
        InitCollectionsExcample ice = context.getBean(InitCollectionsExcample.class);
        
        LOG.info("=== someProps ===");
        for(Object obj : ice.someProps.keySet()){
            LOG.info("key: " + obj + " " + " value:" + ice.someProps.getProperty((String)obj));
        }
        
        LOG.info("=== someList ===");
        for(int i = 0; i < ice.someList.size(); i++){
            LOG.info(ice.someList.get(i));
        }
        
        LOG.info("=== someMap ===");
        for(Object obj : ice.someMap.keySet()){
            LOG.info("key: " + obj + " " + " value:" + ice.someMap.get(obj));
        }
        
        LOG.info("=== someSet ===");
        for(Object obj : ice.someSet){
            LOG.info(obj);
        }
        
        ((ConfigurableApplicationContext)context).close();
    }
}
