package com.bit.order.service;

import com.bit.order.bean.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    Order createOrder(Long userId, Long productId);
}
