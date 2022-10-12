package com.gxa.service.impl;

import com.gxa.entity.InBound;
import com.gxa.mapper.InBoundMapper;
import com.gxa.service.InBoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InBoundServiceImpl implements InBoundService {

    @Autowired
    private InBoundMapper inBoundMapper;

    @Override
    public InBound queryAll() {
        InBound inBound = this.inBoundMapper.queryall();
        return inBound;
    }
}
