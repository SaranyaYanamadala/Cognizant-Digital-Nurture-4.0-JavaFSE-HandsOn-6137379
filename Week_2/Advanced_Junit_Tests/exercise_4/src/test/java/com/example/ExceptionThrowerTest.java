package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowerTest {
    
    @Test 
    void testThrowsException() {
        ExceptionThrower exp = new ExceptionThrower();
        assertThrows(IllegalArgumentException.class, exp::throwException);
    }
}
