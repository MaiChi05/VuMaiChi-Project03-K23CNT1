package com.example.bai01.Controller;
import com.example.bai01.Service.MyGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyGreetingController {
    @Autowired
    private final MyGreetingService myGreetingService;
    public MyGreetingController(MyGreetingService greetingService)
    {
        this.myGreetingService = greetingService;
    }
    @GetMapping("/my-greet")
    public String greet() {
        return myGreetingService.greet();
    }
}