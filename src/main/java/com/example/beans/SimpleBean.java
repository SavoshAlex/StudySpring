package com.example.beans;

import java.beans.ConstructorProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SimpleBean implements Bean, InitializingBean, DisposableBean {
    
    private final static Logger LOG = Logger.getLogger(SimpleBean.class);
    
    private String name;

    public SimpleBean() {
        name = "SimpleBean";
    }

    @ConstructorProperties({"name"})
    public SimpleBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void afterPropertiesSet() throws Exception {
        LOG.info("after properties set code here");
    }

    public void destroy() throws Exception {
        LOG.info("pre destroy code here");
    }

}
