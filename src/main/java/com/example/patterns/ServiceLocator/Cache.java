package com.example.patterns.ServiceLocator;

import com.example.patterns.ServiceLocator.services.Service;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;


public class Cache {
    
    private final static Logger LOG = Logger.getLogger(Cache.class);
    
    private List<Service> services;

    public Cache() {
        services = new LinkedList<Service>();
    }
    
    public Service getService(String name){
        for(Service service : services){
            if(name.equalsIgnoreCase(service.getName())){
                LOG.info("Returning cached " + name + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) {
        boolean exists = false;
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exists = true;
            }
        }
        if (!exists) {
            services.add(newService);
        }
    }

    
    
}
