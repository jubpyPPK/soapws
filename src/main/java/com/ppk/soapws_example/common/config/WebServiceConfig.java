package com.ppk.soapws_example.common.config;

import com.ppk.soapws_example.webservice.OrderServiceImpl;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

    @Autowired private SpringBus bus;
    @Autowired private OrderServiceImpl orderService;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, orderService);
        endpoint.publish("/order");
        return endpoint;
    }


}
