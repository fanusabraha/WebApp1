package com.exercises.WebApp.controller;

import com.exercises.WebApp.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class AdminClassController {
    @Autowired
    Customer customer;
    @RequestMapping("loggin")
    public String getCustomerRole (){
    new Customer("Andreas","Teacher","ADMIN");
        return"if_else";}
}
