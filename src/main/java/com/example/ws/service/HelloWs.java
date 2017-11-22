package com.example.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by thy on 2017/11/20.
 */
@WebService
public interface HelloWs {

    @WebMethod
    String helloWs();
}
