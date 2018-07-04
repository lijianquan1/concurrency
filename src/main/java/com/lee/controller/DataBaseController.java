package com.lee.controller;

import com.lee.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author:ljq
 * Date: 2018/7/4
 **/
@RestController
@MapperScan("com.lee.mapper")
public class DataBaseController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        userService.findAll();
        return "hello world";
    }
}
