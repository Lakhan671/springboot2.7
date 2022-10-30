package com.lakhan.springboot27.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {
    @GetMapping("/get")
    public String get(){
        return "get mapping call.";

    }
}
