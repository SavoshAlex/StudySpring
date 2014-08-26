package com.example.beans;


public class ServiceLocator implements Bean {

    private String name;
    
    public ServiceLocator() {
        name = "ServiceLocator";
    }

    public String getName() {
        return name;
    }
    
    public Bean createBeanInstance(){
        return new SimpleBean();
    }
    
}
