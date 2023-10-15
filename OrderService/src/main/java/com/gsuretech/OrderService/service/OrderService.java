package com.gsuretech.OrderService.service;

import com.gsuretech.OrderService.model.OrderRequest;
import com.gsuretech.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
