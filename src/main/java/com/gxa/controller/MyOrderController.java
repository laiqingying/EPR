package com.gxa.controller;

import com.gxa.dto.MyOrderDto;
import com.gxa.entity.MyOrder;
import com.gxa.service.MyOrderService;
import com.gxa.utils.Result;
import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "销售订单接口")
public class MyOrderController {


    // @RequiresPermissions("order:list") 权限控制注解
    @GetMapping("/orders")
    public Result list(ModelMap map){
        MyOrderDto myOrderDto = new MyOrderDto();
//        List<MyOrder> myOrders = myOrderDto.queryAll();
        Result result = new Result(0,"successMyOrder",null,null);
        return result;
    }
}
