package com.exercises.WebApp.controller;

import com.exercises.WebApp.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class AdminClassController {

    @GetMapping("/loggin")
    public String getCustomerRole (ModelMap modelMap){
        List<Customer> customers= new ArrayList<>();
        customers.add(new Customer("Andreas","Teacher","ADMIN"));
        customers.add(new Customer("olaf","Coordinator","USER"));
        customers.add(new Customer("olga","Manager","USER"));
        customers.add(new Customer("Sylvia","Boss","USER"));
        modelMap.put("customerData",customers);
        return"if_else";}
}
