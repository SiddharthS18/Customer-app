package com.example.customerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CustomerAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerAppApplication.class, args);
    }
}

