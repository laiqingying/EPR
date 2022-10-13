package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品")
public class Goods {
    @ApiModelProperty("商品id")
    private Integer gid;
    @ApiModelProperty("商品名称")
    private String gname;
    @ApiModelProperty("商品图片")
    private String picture;
    @ApiModelProperty("商品价格")
    private double price;
    @ApiModelProperty("品牌")
    private String brand;
    @ApiModelProperty("状态 1：上架  0：下架")
    private Integer status;
}
