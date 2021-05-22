package com.dckhoa.training.springboot.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }
}
