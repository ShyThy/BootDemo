package com.example.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

/**
 * Created by thy on 2017/11/20.
 */
@WebService
@BindingType(value = "http://www.w3.org/2003/05/soap/bindings/HTTP/")
public interface WsService {

    @WebMethod(operationName = "wsTest")
    String wsTest(@WebParam String name);
}
