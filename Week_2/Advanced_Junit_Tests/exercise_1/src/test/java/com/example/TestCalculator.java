package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    Calculator calc = new Calculator();
    
    @Test 
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test 
    void testSubtract() {
        assertEquals(10, calc.subtract(20, 10));
    }

    @Test 
    void testMultiply() {
        assertEquals(9, calc.multiply(3, 3));
    }

    @Test 
    void testDivide() {
        assertEquals(5, calc.divide(15, 3));
    }
}
