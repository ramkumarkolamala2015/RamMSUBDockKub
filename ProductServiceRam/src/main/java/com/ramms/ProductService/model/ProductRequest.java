package com.ramms.ProductService.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductRequest {
    private String name;
    private long price;
    private long quantity;
}
