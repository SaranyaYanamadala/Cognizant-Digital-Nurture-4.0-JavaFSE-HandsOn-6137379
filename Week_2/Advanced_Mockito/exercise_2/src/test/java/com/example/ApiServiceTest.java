package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class ApiServiceTest {
    
    @Test 
    public void testServiceWithMockRestClient() {
        // Mocking
        RestClient mockClient = mock(RestClient.class);

        // Stubbing
        when(mockClient.getResponse()).thenReturn("Mock Response");

        // Injecting the mock into apiservice
        ApiService service = new ApiService(mockClient);

        // Testing the mock
        String result = service.fetchData();

        // Verifying the mock
        assertEquals("Fetched Mock Response", result);
    }
}
