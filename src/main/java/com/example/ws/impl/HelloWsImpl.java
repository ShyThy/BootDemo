package com.example.ws.impl;

import com.example.ws.service.HelloWs;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by thy on 2017/11/20.
 */
@WebService(targetNamespace = "http://service.ws.example.com/", endpointInterface = "com.example.ws.service.HelloWs")
@Component
public class HelloWsImpl implements HelloWs{

    @Override
    public String helloWs() {
        return null;
    }
}
