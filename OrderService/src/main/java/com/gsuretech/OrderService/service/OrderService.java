package com.gsuretech.OrderService.service;

import com.gsuretech.OrderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
