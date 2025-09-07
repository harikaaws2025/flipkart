package com.flipkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FlipkartApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(FlipkartApplication.class, args);
    }
}

@RestController
class HelloController {
    @GetMapping("/")
    public String home() {
        return "Welcome to Flipkart Spring Boot WAR app!";
    }
}

