package com.netflix.clone.netflix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String Hello(){
        System.out.println("aaaa");
        return "hello";
    }

}
