package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.MyService;

public class MyServiceTest {
    @Test
    public void testExternalAPI() {
        // Mocking the external API
        ExternalAPI mockapi = Mockito.mock(ExternalAPI.class);

        // stubbing the method of external API
        when(mockapi.getData()).thenReturn("Mocking and Stubbing.");

        // Injecting mock into MyService
        MyService service = new MyService(mockapi);

        // Asserting the result
        String result = service.fetchData();
        assertEquals("Mocking and Stubbing.", result);

        // verifying the mock
        verify(mockapi).getData();
    }
}
