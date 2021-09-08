package com.example.web_spring_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// API; Get, Post, Parameter by path Practice

@RestController
public class hello_api_controller {

    @GetMapping("/api/get/{id}")
    public String get_test(@PathVariable Integer id, String name){
        return String.format("This is GET method test.\n" +
                "Data you sent on URL is %d and on parameter is %s.", id, name);
    }

    @PostMapping("/api/post/{id}")
    public String post_test(@PathVariable Integer id, String name){
        return String.format("This is POST method test.\n" +
                "Data you sent on URL is %d and on parameter is %s.", id, name);
    }

}
