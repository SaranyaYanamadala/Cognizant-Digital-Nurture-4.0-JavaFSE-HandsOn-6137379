package com.example;

import org.junit.jupiter.api.*;

// Setting the order of the class
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestsOrder {
    @Test 
    @Order(2)
    void testB() {
        System.out.println("This is test B");
    }

    @Test 
    @Order(1)
    void testA() {
        System.out.println("This is test A");
    }

    @Test 
    @Order(3)
    void testC() {
        System.out.println("This is test C");
    }
}
