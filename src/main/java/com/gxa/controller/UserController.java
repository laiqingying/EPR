package com.gxa.controller;

import com.gxa.dto.UserDto;
import com.gxa.entity.User;
import com.gxa.utils.R;
import com.gxa.utils.Result;
import io.swagger.annotations.*;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "用户接口")
public class UserController {

//    @Resource
//    private UserDto userDto;

    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "Authorization", value = "令牌", paramType = "header", required = true),
            @ApiImplicitParam(name = "uname", value = "当前登录用户的账号，由后台从令牌中解析取得", required = true),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "返回用户详细信息"),
            @ApiResponse(code = 306, message = "登录已超时，请重新登录"),
            @ApiResponse(code = 307, message = "令牌格式不正确"),
            @ApiResponse(code = 401, message = "没有权限"),
            @ApiResponse(code = 403, message = "无效请求，本系统只支持AJAX请求"),
            @ApiResponse(code = 500, message = "服务器内部错误")
    })
    @ApiOperation("用户登录")
    @PostMapping("/user/login")
    public Result login(User user){
        UserDto userDto = new UserDto();
        User login = userDto.login(user);
        Result result = new Result(0,"success",null,login);
        return result;
 }






}
