package ir.mojtabapourasghar.spring_security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint!";
    }

    @GetMapping("/private")
    public String privateEndpoint() {
        return "This is a private endpoint!";
    }
}
