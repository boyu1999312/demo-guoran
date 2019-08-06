package com.guoran.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {

    @GetMapping("hello")
    public String hello(){
        System.out.println("嘻嘻");
        return "index";
    }
}
