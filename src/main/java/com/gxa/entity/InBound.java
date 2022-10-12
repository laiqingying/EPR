package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("入库表实体类")
public class InBound {

    @ApiModelProperty("入库表id")
    private Integer wid;

    @ApiModelProperty("入库时间")
    private Date n;

    @ApiModelProperty("入库编号")
    private String c;

    @ApiModelProperty("入库状态")
    private String b;

    @ApiModelProperty("入库类型")
    private Integer a;
//
//    private
//
//    private
//
//    private
//
//    private

}
