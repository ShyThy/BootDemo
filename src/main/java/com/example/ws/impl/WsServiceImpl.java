package com.example.ws.impl;

import com.example.ws.service.WsService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by thy on 2017/11/20.
 */
@WebService(
//        name = "myWs",
//        serviceName = "WsService",
        targetNamespace = "http://service.ws.example.com/", endpointInterface = "com.example.ws.service.WsService")
@Component
public class WsServiceImpl implements WsService {
    @Override
    public String wsTest(String name) {
        System.err.println("ws accept param : " + name);
        return "success";
    }
}
