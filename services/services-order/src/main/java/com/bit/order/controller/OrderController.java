package com.bit.order.controller;

import com.bit.order.bean.Order;
import com.bit.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;
    @RequestMapping("/order")
    public Order createOrder(@RequestParam("userId") Long userId,
                             @RequestParam("productId")Long productId){
        return orderService.createOrder(userId,productId);
    }
}
