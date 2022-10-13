package com.gxa.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Purchase {
    private Integer id;
    private String purchaseno;
    private Integer status;
    private String buyqty;
    private double price;
    private Date createTime;
    private String remark;



}
