package com.gxa.dto;


import com.gxa.entity.MyOrder;
import com.gxa.service.MyOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyOrderDto {

    @Autowired
    private MyOrderService myOrderService;

    public List<MyOrder> queryAll(){
        List<MyOrder> myOrders = this.myOrderService.queryAll();

        return myOrders;
    }
}
