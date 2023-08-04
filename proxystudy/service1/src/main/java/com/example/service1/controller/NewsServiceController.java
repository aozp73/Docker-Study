package com.example.service1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewsServiceController {
    
    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello from NewsService";
    }

    @GetMapping("/weather/{id}")
    @ResponseBody
    public String tes(@PathVariable Integer id) {

        return id + " from Weather-News-Service";
    }

    @GetMapping("/economy/{id}")
    @ResponseBody
    public String economy(@PathVariable Integer id) {

        return id + " from Economy-News-Service";
    }

    @GetMapping("/switchpage")
    public String switchtoshop() {

        return "/switchtoshop";
    }
}
