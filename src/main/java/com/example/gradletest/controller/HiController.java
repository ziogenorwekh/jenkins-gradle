package com.example.gradletest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HiController {

    @GetMapping("/")
    public String indexData(Model model) {
        String str = "Hello world";
        model.addAttribute("str", str);
        return "index";
    }
}
