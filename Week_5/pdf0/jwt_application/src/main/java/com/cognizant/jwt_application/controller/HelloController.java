package com.cognizant.jwt_application.controller;


import com.cognizant.jwt_application.config.JwtTokenProvider;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {

    private final JwtTokenProvider jwtTokenProvider;

    public HelloController(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @PostMapping("/token")
    public Map<String, String> login(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String token = jwtTokenProvider.createToken(username);
        return Map.of("token", token);
    }

    @GetMapping("/secure")
    public String secureEndpoint() {
        return "This is a secured endpoint!";
    }
}
