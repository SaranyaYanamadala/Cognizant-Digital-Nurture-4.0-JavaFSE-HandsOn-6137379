package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test 
    public void testAssertions() {
        assertEquals(5, 2 + 3, "Should be equal to 5");
        assertTrue(5 > 3, "5 should be greater than 3");
        assertFalse(5 < 3, "5 should not be less than 3");
        assertNull(null, "should be null");
        assertNotNull(new Object(), "should be not null");
    }
}
