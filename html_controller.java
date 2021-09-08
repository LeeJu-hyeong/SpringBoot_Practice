package com.example.web_spring_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class html_controller {

    @GetMapping("/")
    public String name_input_page(){
        return "index";
    }

    @PostMapping("/main")
    public String main_page(Model model, String name, int num){
        model.addAttribute("username", name);

        int ret = num * (num + 1) / 2;
        model.addAttribute("num", num);
        model.addAttribute("sum", ret);

        return "main";
    }
}
