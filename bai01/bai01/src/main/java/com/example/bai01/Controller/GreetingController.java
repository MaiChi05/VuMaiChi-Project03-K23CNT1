package com.example.bai01.Controller;
import com.example.bai01.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {
    private final GreetingService greetingService;
    // Sử dụng Constructor-based Dependency Injection  @Autowired
    public GreetingController(GreetingService greetingService) {  this.greetingService = greetingService;
    }
    @GetMapping("/greet")
    public String greet() {
        return greetingService.greet("Mai Chi");  }
}
