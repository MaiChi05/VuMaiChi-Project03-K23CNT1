package com.example.bai01.Service;

import org.springframework.stereotype.Service;
@Service
public class MyGreetingService {
    public String greet() {
        return "<h1>Hello from MyGreetingService!";
    }
}