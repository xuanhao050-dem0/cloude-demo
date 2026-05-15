package com.bit.product.service.impl;

import com.bit.product.bean.Product;
import com.bit.product.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProduct(Long productId) {
        Product product = new Product();
        product.setProductId(1l);
        product.setPrice(30);
        product.setProductName("apple-"+product.getProductId());
        product.setCount(2);
        return product;

    }
}
