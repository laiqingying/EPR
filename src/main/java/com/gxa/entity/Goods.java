package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

/**
 * @author:
 * @ClassName:Goods
 * @Package:com.gxa.entity.Goods
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/
import lombok.Data;

@Data
@ApiModel("商品")
public class Goods {
    @ApiModelProperty("商品id")
    private Integer gid;

    @ApiModelProperty("商品名字")
    private  String gname;

    @ApiModelProperty("商品图片")
    private  String picture;

    @ApiModelProperty("商品价格")
    private  double price;

    @ApiModelProperty("商品品牌")
    private  String brand;

    @ApiModelProperty("状态 1:上架 0:下架")
    private  Integer status;

}
