/**
 * tfsoft.com Inc.
 * Copyright (c) 2009-2018 All Rights Reserved.
 */
package com.tfsoft.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author st st@tfsoft.com on 2018-11-13
 */
//在这里我们使用@SpringBootApplication指定这是一个spring boot的应用程序
@SpringBootApplication
public class App {
    public static void main(String[] args){
        //在main方法中进行启动我们的应用程序
        SpringApplication.run(App.class,args);
    }
}
