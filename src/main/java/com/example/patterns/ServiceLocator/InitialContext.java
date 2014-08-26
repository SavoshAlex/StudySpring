package com.example.patterns.ServiceLocator;

import com.example.patterns.ServiceLocator.services.ServiceOneImpl;
import com.example.patterns.ServiceLocator.services.ServiceTwoImpl;
import org.apache.log4j.Logger;


public class InitialContext {
    
    private final static Logger LOG = Logger.getLogger(InitialContext.class);
    
    public Object lookup(String name){
        if(name.equalsIgnoreCase("ServiceOne")){
            LOG.info("Looking up and creating a new ServiceOne object");
            return new ServiceOneImpl();
        } else if(name.equalsIgnoreCase("ServiceTwo")){
            LOG.info("Looking up and creating a new ServiceTwo object");
            return new ServiceTwoImpl();        
        }
        return null;
    }
}
