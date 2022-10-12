package com.gxa.controller;

import com.gxa.common.uitls.TableResult;
import com.gxa.entity.InBound;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepositController {

   //查询

   @GetMapping("/ware/dep")
   public TableResult query(){
      List list  = new ArrayList();
      list.add("数据");
      list.add("来了");
      list.add("准备");
      list.add("接收");

      TableResult r = new TableResult(0,"suc",list);

      return r;
   }

   //完成入库
   @PostMapping("/ware/add")
   public TableResult add(InBound inBound){
      TableResult r = new TableResult(0,"添加成功",null);

      return r;
   }

   //查询员工 emp表
   @GetMapping("/ware/emp")
   public TableResult queryStaff(){

      List list  = new ArrayList();
      list.add("李四");
      list.add("王五");
      list.add("赵六");
      list.add("周七");

      TableResult r = new TableResult(0,"查询成功",list);
      return r;
   }

   //指派员工   修改关联eid
   @PostMapping("/ware/updata")
   public TableResult assign(Integer eid){   // assign 分派，布置
      TableResult r = new TableResult(0,"指派成功","null");
      return r;
   }

   //撤回指派  删除关联eid
   @DeleteMapping("/ware/del")
   public TableResult repeal(Integer eid){  //repeal 废除，废止
      TableResult r = new TableResult(0,"撤销指派成功",null);

      return r;
   }

}
