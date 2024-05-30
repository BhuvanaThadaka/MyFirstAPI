package com.rajlee.demoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/display")
    public String display() {
        return "Hello World";
    }
}
