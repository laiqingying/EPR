package com.gxa.service;

import com.gxa.entity.Inbound;

public interface InBoundService {
    Inbound queryAll(); //查询所以


    void add();  //入库  添加操作


     void queryEmps();   //查询员工 emp表


    void eidAdd();  //指派员工 添加



    void eidDelete();  //撤回指派


}
