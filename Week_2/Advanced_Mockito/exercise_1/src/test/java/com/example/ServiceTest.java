package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ServiceTest {
    @Test 
    public void  testServiceWithMockRepository() {
        // mocking
        Repository mockRepo = mock(Repository.class);

        // stubbing
        when(mockRepo.getData()).thenReturn("Mock Data");
    
        // Injecting the mock
        Service service = new Service(mockRepo);

        // Testing the service
        String data = service.processData();

        // Verifying the mock
        assertEquals("Processed Mock Data", data);
        verify(mockRepo).getData();
    }
}
