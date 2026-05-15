package com.bit.product.controller;

import com.bit.product.bean.Product;
import com.bit.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/product/{productId}")
    public Product getProduct(Long productId){
        return productService.getProduct(productId);
    }
}
