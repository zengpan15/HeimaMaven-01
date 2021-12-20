package com.itheima.security_demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserController {
    @GetMapping("/name")
    @PreAuthorize("hasRole('ADMIN')")
   public String getUser(){
       return "zhangsan";
   }
}
