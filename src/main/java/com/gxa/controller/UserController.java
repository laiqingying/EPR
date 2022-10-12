package com.gxa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {



    @PostMapping("/user/login")
    public String login(){

        return "test";
 }
}
