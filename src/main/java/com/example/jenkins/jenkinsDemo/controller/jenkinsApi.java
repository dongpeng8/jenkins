package com.example.jenkins.jenkinsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class jenkinsApi {
    @GetMapping("/test")
    public String getMsg(){
        return "Hello word";
    }
}
