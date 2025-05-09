package com.example.simple_api;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    @GetMapping("/new-endpoint")
    public String newEndpoint() {
        return "This is a new endpoint!";
    }
}
