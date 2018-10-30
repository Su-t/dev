package com.tfsoft.dubbo.customer.controller;

import com.tfsoft.dubbo.customer.pojo.User;
import com.tfsoft.dubbo.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

   @RequestMapping("/toIndex")
    public String toIndex(){
       return "index";
   }
   @ResponseBody
   @RequestMapping( value = "/invokeService",method = RequestMethod.GET)
    public User invokeService() {
       User outUser = new User();
       String name = customerService.getName();
       outUser.setUsername(name);
       return outUser;
    }
}
