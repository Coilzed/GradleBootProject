package org.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/controller")
    public String index() {
        return "Greetings from Spring Boot";
    }
}
