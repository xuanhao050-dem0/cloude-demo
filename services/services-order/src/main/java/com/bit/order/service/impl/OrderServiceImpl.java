package com.bit.order.service.impl;


import com.bit.order.bean.Order;
import com.bit.order.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(Long userId, Long productId) {
        Order order=new Order();
        order.setOrderId(1L);
        //TODO 计算
        order.setTotalAmount(0);
        order.setUserId(1L);
        order.setNickName("zhangsan");
        order.setAddress("lingnanshifan");
        //TODO 远程查询商品列表
        order.setProductList(null);


        return order;
    }
}
