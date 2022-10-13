package com.gxa.controller;

import com.gxa.common.uitls.TableResult;
import com.gxa.service.MyOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(tags = "销售订单接口")
public class MyOrderController {

    //@Autowired
    private MyOrderService myOrderService;

    // @RequiresPermissions("order:list") 权限控制注解
    @GetMapping("/orders")
    @ApiOperation("查询所有销售订单")
    public TableResult list(ModelMap map){
//        List<MyOrder> myOrders = myOrderDto.queryAll();

        TableResult result = new TableResult(0,"successMyOrder",null,null);
        return result;
    }
}
