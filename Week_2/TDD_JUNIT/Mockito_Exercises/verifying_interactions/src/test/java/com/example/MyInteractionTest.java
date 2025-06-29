package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyInteractionTest {
    
    @Test
    public void testExternalAPI() {
        // mocking
        ExternalAPI mockapi = Mockito.mock(ExternalAPI.class);

        // stubbing
        when(mockapi.getData("Mockito")).thenReturn("Verifying interactions");

        // using the mock
        MyInteraction interaction = new MyInteraction(mockapi);
        String result = interaction.fetchData("Mockito");

        // Assert the result
        assertEquals("Verifying interactions", result);

        // verifying the mock
        verify(mockapi).getData("Mockito");
    }
}
