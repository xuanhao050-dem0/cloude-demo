package com.bit.order.bean;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Long orderId;
    private Integer totalAmount;
    private Long userId;
    private String nickName;
    private String address;
    private List<Object> productList;
}
