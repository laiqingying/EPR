package com.gxa.controller;

import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.TableResult;
import com.gxa.dto.InboundDto;
import com.gxa.entity.Inbound;
import com.gxa.service.InBoundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "入库接口")
@RestController
public class DepositController {

   @Autowired
   private InBoundService inBoundService;
   //查询
   @ApiOperation("入库页面查询接口")
   @GetMapping("/ware/dep")
   public TableResult query(@ApiParam("接收参数的dto") InboundDto inboundDto, @ApiParam("页数") Integer page, @ApiParam("条数") Integer limit){
//      List list  = new ArrayList();
//      list.add("数据");
//      list.add("来了");
//      list.add("准备");
//      list.add("接收");

      PageHelper.startPage(page, limit);  //使用此方法进行分页

      List<Inbound> inbounds = this.inBoundService.queryAll(); //调用Service

      TableResult r = new TableResult(0,"suc",inbounds);

      return r;
   }

   //完成入库
   @ApiOperation("完成入库接口")
   @PostMapping("/ware/add")
   public TableResult add(@ApiParam("封装入库dto") Inbound inBound){
      TableResult r = new TableResult(0,"添加成功",null);

      return r;
   }

   //查询员工 emp表
   @ApiOperation("查询员工接口")
   @GetMapping("/ware/emp")
   public TableResult queryStaff(@ApiParam("页数") Integer page, @ApiParam("条数") Integer limit){

      List list  = new ArrayList();
      list.add("李四");
      list.add("王五");
      list.add("赵六");
      list.add("周七");


      TableResult r = new TableResult(0,"查询成功",list);
      return r;
   }

   //指派员工   修改关联eid
   @ApiOperation("指派员工接口")
   @PostMapping("/ware/updata")
   public TableResult assign(Integer eid){   // assign 分派，布置

      TableResult r = new TableResult(0,"指派成功","null");
      return r;
   }

   //撤回指派  删除关联eid
   @ApiOperation("撤销指派接口")
   @DeleteMapping("/ware/rep")
   public TableResult repeal(Integer eid){  //repeal 废除，废止

      this.inBoundService.eidRepeal(eid);
      TableResult r = new TableResult(0,"撤销指派成功",null);

      return r;
   }

}
