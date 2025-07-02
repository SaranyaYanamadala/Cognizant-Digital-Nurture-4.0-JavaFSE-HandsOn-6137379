package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test 
    void testFetchDataMultipleReturns() {
        // mocking
        ExternalAPI mockapi = mock(ExternalAPI.class);

        // stubbing
        when(mockapi.fetchData()).thenReturn("First Call").thenReturn("Second Call");

        // using the service
        MyService service = new MyService(mockapi);
        String result = service.getCombinedData();

        // Assertion
        assertEquals("First Call & Second Call", result);

        // Verifying the interaction
        verify(mockapi, times(2)).fetchData();
    }
}
