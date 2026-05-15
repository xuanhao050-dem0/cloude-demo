package com.bit.product.bean;

import lombok.Data;

@Data
public class Product {
    private Long ProductId;
    private Integer price;
    private String productName;
    private Integer count;
}
