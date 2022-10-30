package com.lakhan.springboot27.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {
    @GetMapping("/errortest")
    public String get(){
        throw new NullPointerException();
       // return "get mapping call.";
    }
}
