/**
 * tfsoft.com Inc.
 * Copyright (c) 2009-2018 All Rights Reserved.
 */
package com.tfsoft.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author st st@tfsoft.com on 2018-11-13
 */
//在这里我们使用RestController(等价于@Controller和@RequestBody)
@RestController
public class HelloSpringboot {

    /**
     *
     * @return
     */
    @RequestMapping("/helloSpringboot")
    public String helloSpringboot(){
        return "hello";
    }
}
