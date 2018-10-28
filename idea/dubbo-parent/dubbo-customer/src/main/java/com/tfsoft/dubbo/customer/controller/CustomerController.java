package com.tfsoft.dubbo.customer.controller;

import com.tfsoft.dubbo.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

   @RequestMapping("/toIndex")
    public String toIndex(){
       String name = customerService.getName();
       return name;
   }
}
