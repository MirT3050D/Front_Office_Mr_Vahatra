package com.example.assignation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot 3.5.10 with Java 17!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running successfully!";
    }

    @PostMapping("/echo")
    public String echo(String message) {
        return "Echo: " + (message != null ? message : "No message provided");
    }
}
