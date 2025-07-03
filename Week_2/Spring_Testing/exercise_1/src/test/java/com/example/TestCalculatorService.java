package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculatorService {
    
    @Test 
    public void testAdd() {
        CalculatorService service = new CalculatorService();
        int result = service.add(5, 3);
        assertEquals(8, result);
    }
}
