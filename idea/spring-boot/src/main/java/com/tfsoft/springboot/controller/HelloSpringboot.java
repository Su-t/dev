/**
 * tfsoft.com Inc.
 * Copyright (c) 2009-2018 All Rights Reserved.
 */
package com.tfsoft.springboot.controller;

import com.tfsoft.springboot.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author st st@tfsoft.com on 2018-11-13
 */
//在这里我们使用RestController(等价于@Controller和@RequestBody)
@RestController
public class HelloSpringboot {

    /**
     * 1 在页面上显示hello。
     * @return
     */
    @RequestMapping("/helloSpringboot")
    public String helloSpringboot(){
        return "hello";
    }

    /**
     * 2 在页面上显示返回的json数据（因为spring boot默认使用的json解析框架是jackson）
     * @return
     */
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("苏腾");
        return user;
    }
}
