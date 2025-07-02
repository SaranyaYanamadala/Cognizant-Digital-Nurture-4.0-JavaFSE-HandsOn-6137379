package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;


public class MultiReturnServiceTest {
    @Test 
    public void testServiceWithMultipleReturnValues() {
        // Mocking 
        Repository mockRepo = mock(Repository.class);

        // Stubbing
        when(mockRepo.getData()).thenReturn("First Mock Data").thenReturn("Second Mock Data");

        // Injecting the mock
        Service service = new Service(mockRepo);

        // Testing the mock
        String firstResult = service.processData();
        String secondResult = service.processData();

        // Verifying the mock
        assertEquals("Processed First Mock Data", firstResult);
        assertEquals("Processed Second Mock Data", secondResult);
    }
}
