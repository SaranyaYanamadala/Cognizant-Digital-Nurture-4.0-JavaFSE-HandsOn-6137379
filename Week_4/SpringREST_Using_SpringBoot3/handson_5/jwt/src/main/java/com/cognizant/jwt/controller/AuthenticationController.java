package com.cognizant.jwt.controller;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Base64;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START /authenticate");
        
        String user = getUser(authHeader);
        LOGGER.debug("Decode username: {}", user);
        
        String token = generateJWT(user);
        LOGGER.debug("Generated JWT Token: {}", token);

        LOGGER.debug("Authorization Header: {}", authHeader);

        Map<String, String> map = new HashMap<>();
        map.put("token", "");

        LOGGER.info("END /authenticate");
        return map;
    }
    
    // Decoding the auth header and extracting the user
    private String getUser(String authHeader) {
    	if(authHeader == null || !authHeader.startsWith("Basic ")) {
    		LOGGER.warn("Invalid Authorization header.");
    		return null;
    	}
    	
    	// Removing prefix
    	String base64Credentials = authHeader.substring("Basic ".length());
    	LOGGER.debug("Base64 Encoded Credentials: {}", base64Credentials);
    	
    	// Decoding Base64 to original string
    	byte[] decodeBytes = Base64.getDecoder().decode(base64Credentials);
    	String decodedString = new String(decodeBytes);
    	LOGGER.debug("Decoded Credentials String: {}", decodedString);
    	
    	// Extracting username
    	int colonIdx = decodedString.indexOf(":");
    	String username = (colonIdx != -1)? decodedString.substring(0, colonIdx) : decodedString;
    	
    	return username;
    }
    
    // Generating JWT token
    private String generateJWT(String username) {
    	Key key = Keys.hmacShaKeyFor("my-super-secret-key-my-super-secret-key".getBytes());

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(key)
                .compact();
    }

}

