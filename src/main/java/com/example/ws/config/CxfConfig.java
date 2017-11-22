package com.example.ws.config;

import com.example.ws.service.HelloWs;
import com.example.ws.service.WsService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**sss
 * Created by thy on 2017/11/20.
 */
@Configuration
public class CxfConfig {

//    @Bean(name = Bus.DEFAULT_BUS_ID)
//    public SpringBus springBus() {
//        return new SpringBus();
//    }
////
////    @Bean
////    public WsService wsService() {
////        return new WsServiceImpl();
////    }

    @Autowired
    SpringBus springBus;
    @Autowired
    WsService wsService;

    @Autowired
    HelloWs helloWs;


    @Bean
    public Endpoint endpoint() {
//        EndpointImpl endpoint = new EndpointImpl(springBus, wsService);
        EndpointImpl endpoint = new EndpointImpl(springBus, helloWs);

        endpoint.publish("/helloWs");
        return endpoint;
    }
}
