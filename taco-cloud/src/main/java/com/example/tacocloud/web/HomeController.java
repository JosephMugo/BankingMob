package com.example.tacocloud.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/")
    public String homePost() {
        return "success";
    }

    @PutMapping("/home")
    public String homePut() {
        return " we did ";
    }

}
