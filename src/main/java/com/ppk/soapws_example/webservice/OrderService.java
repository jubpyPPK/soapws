package com.ppk.soapws_example.webservice;

import com.ppk.soapws_example.webservice.domain.CreateOrderRequest;
import com.ppk.soapws_example.webservice.domain.OrderResponse;

import javax.jws.WebParam;

public interface OrderService {

    OrderResponse createOrder(
            @WebParam(name = "createOrderRequest",targetNamespace = "")
            CreateOrderRequest createOrderRequest);

    OrderResponse deleteOrder(
            @WebParam(name = "orderId",targetNamespace = "")
                    String orderId);



}
