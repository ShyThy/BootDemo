package com.example.boot;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by thy on 2017/11/20.
 */
public class WsClient {
    public static void main(String[] args) {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client = dcf.createClient("http://localhost:8081/soap/myWs?wsdl");
        try {
            Object[] objects = client.invoke("wsTest", "zhangsan");
            System.out.println(objects[0].getClass());
            System.out.println(objects[0].toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
