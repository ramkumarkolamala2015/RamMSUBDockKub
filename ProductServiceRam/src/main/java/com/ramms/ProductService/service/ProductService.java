package com.ramms.ProductService.service;

import com.ramms.ProductService.entity.Product;
import com.ramms.ProductService.model.ProductRequest;
import com.ramms.ProductService.model.ProductResponse;

public interface ProductService {
    Product addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    //void reduceQuantity(long productId, long quantity);
}
