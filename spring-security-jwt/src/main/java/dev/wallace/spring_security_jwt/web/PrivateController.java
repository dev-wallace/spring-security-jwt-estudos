package dev.wallace.spring_security_jwt.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("private")
public class PrivateController {

    
    @GetMapping
    public String getMassage(){
        return "Hello from private API";
    }
    


    
}
