package com.example;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {
    public User getUserById(Long id) {
        throw new NoSuchElementException("User with ID not found : " + id);
    }
}