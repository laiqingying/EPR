package com.gxa.dto;

import com.gxa.entity.User;
import com.gxa.utils.Result;

public class UserDto {
    public User login(User user){

        user.setUname("wxj");
        user.setPassword("531");

        return user;
    }
}
