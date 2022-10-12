package com.gxa.service.impl;

import com.gxa.entity.Inbound;
import com.gxa.mapper.InboundMapper;
import com.gxa.service.InBoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InboundServiceImpl implements InBoundService {

    @Autowired
    private InboundMapper inBoundMapper;

    @Override
    public Inbound queryAll() {
        Inbound inBound = this.inBoundMapper.queryall();
        return inBound;
    }

    @Override
    public void add() {  //入库  添加操作

    }

    @Override
    public void queryEmps() {  //查询员工 emp表

    }

    @Override
    public void eidAdd() {  //指派员工 添加

    }

    @Override
    public void eidDelete() {  //撤回指派

    }
}
