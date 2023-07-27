package com.example.product.service;

import com.example.product.dto.ProductRequest;
import com.example.product.dto.ProductResponse;


public interface ProductService {
    void createProduct(ProductRequest request);
    ProductResponse getProductById(Long id);
    boolean decreaseCountByCount(Long id,int count);
    void increaseCountByCount(Long id,int count);
}
