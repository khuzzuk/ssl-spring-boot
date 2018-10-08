package com.example.sslspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("data")
    public List<String> data() {
        return Arrays.asList("A", "B", "C");
    }
}
