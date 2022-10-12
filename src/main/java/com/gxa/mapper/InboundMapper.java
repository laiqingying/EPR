package com.gxa.mapper;

import com.gxa.entity.Inbound;


public interface InboundMapper {
//    User queryMyuserNameAndPwd1(@Param("userName") String userName,@Param("pwd") String pwd);
      Inbound queryall();

      void add();  //入库  添加操作

      void queryEmps();   //查询员工 emp表

      void eidAdd();  //指派员工 添加

      void eidDelete();  //撤回指派

}
