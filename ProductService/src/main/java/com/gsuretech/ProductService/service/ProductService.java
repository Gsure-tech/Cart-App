package com.gsuretech.ProductService.service;

import com.gsuretech.ProductService.model.ProductRequest;
import com.gsuretech.ProductService.model.ProductResponse;

public interface ProductService {
    long addproduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
