package com.seamk.springdockertest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String sayHelloToSomeone() {
        return "Hello, Someone!";
    }
}
