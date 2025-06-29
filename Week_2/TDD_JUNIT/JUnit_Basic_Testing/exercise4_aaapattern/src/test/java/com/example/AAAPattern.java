package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class AAAPattern {
    private Calculator calculator;

    // set up before each test(Arrange)
    @BeforeEach
    public void arrange() {
        System.out.println("Arranging the Calculator....");
        calculator = new Calculator();
    }

    // Tear down after each test
    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }

    @Test
    public void testAdditions() {

        // Act
        int result = calculator.add(10, 5);
        // Assert
        assertEquals(15, result, "10 + 5 should be equal to 15");
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = calculator.subtract(10, 4);
        // Assert
        assertEquals(6, result, "10 - 4 should be 6");
    }
}
