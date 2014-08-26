package com.example.patterns.ServiceLocator.services;

import org.apache.log4j.Logger;

public class ServiceTwoImpl implements Service {
    
    private final static Logger LOG = Logger.getLogger(ServiceTwoImpl.class);
    
    private String name;

    public ServiceTwoImpl() {
        name = "ServiceTwo";
    }
    
    public String getName() {
        return name;
    }

    public void execute() {
        LOG.info("execute " + name);
    }
    
}
