package com.example.sslspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @GetMapping("data")
    public List<String> data() {
        return Arrays.asList("A", "B", "C");
    }
}
