package com.example.patterns.ServiceLocator.services;

import org.apache.log4j.Logger;

public class ServiceOneImpl implements Service {
    
    private final static Logger LOG = Logger.getLogger(ServiceOneImpl.class);
    
    private String name;

    public ServiceOneImpl() {
        name = "ServiceOne";
    }
    
    public String getName() {
        return name;
    }

    public void execute() {
        LOG.info("execute " + name);
    }
    
}
