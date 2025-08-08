package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final Service service;
    public HelloController(Service service) {
        this.service = service;
    }
    @GetMapping("/")
    public String hello() {
        return service.getName();
    }
}

