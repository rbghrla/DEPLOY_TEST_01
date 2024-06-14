package com.example.demo.controller;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeConotroller {
    @GetMapping("/")
    public String hone(){
        log.info("GET /...");
        return "index";
    }
}
