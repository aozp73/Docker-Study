package com.example.service2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShopServiceController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello from ShopService";
    }

    @GetMapping("/jarket/{id}")
    @ResponseBody
    public String clothes(@PathVariable Integer id) {

        return id + " from Jarket-Shop-Service";
    }
      
    @GetMapping("/shoes/{id}")
    @ResponseBody
    public String shoes(@PathVariable Integer id) {

        return id +" from Shoes-Shop-Service";
    }

    @GetMapping("/switchpage")
    public String switchtonews() {
 
        return "/switchtonews";
    }
}
