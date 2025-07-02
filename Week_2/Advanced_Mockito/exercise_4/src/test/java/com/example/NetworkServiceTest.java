package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;


public class NetworkServiceTest {
    
    @Test 
    public void testServiceWithMockNetworkClient() {
        // Mocking
        NetworkClient mockClient = mock(NetworkClient.class);

        // stubbing
        when(mockClient.connect()).thenReturn("Mock Connection");

        // Test the mock
        NetworkService service = new NetworkService(mockClient);
        String result = service.connectToServer();

        // Verifying the mock
        assertEquals("Connected to Mock Connection", result);
    }
}
