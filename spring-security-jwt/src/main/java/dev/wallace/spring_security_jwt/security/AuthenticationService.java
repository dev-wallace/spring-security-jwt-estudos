package dev.wallace.spring_security_jwt.security;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public String authenticate(){
        return "token";
    }
    
}
