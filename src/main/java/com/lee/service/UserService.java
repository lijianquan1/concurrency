package com.lee.service;


import com.alibaba.fastjson.JSON;
import com.lee.entity.User;
import com.lee.mapper.UserMapper;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Author:ljq
 * Date: 2018/7/4
 **/
@Service
@Log
public class UserService {

    //private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;
    public void findAll() {
        User user = userMapper.selectByPrimaryKey(1L);
        log.info(JSON.toJSONString(user));
    }
}
