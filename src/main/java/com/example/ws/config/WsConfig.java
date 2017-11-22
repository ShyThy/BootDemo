package com.example.ws.config;

import com.example.ws.service.WsService;
import org.apache.cxf.bus.spring.SpringBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by thy on 2017/11/20.
 */
@Configuration
public class WsConfig {

    @Autowired
    SpringBus springBus;
    @Autowired
    WsService wsService;

    @Bean
    public Endpoint endpoint2() {
        org.apache.cxf.jaxws.EndpointImpl endpoint = new org.apache.cxf.jaxws.EndpointImpl(springBus, wsService);

        endpoint.publish("/wsService");
        return endpoint;

    }
}
