package com.nicole.vueserver.controller;

import com.nicole.vueserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestVue {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "你小子测试成功！";
    }

    @GetMapping("/getuser")
    public String getuser(){
        return "你小子测试成功！";
    }
}
