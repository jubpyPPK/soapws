package com.ppk.soapws_example.webservice;

import com.ppk.soapws_example.webservice.domain.CreateOrderRequest;
import com.ppk.soapws_example.webservice.domain.OrderResponse;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(name="order",targetNamespace = "")
@Component
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderResponse createOrder(CreateOrderRequest createOrderRequest) {
        return null;
    }

    @Override
    public OrderResponse deleteOrder(String orderId) {
        return null;
    }
}