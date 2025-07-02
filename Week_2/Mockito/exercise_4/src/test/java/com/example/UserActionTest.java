package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


public class UserActionTest {
    @Test 
    void testActionInteraction() {
        // creating the mock
        LoggingService mockService = mock(LoggingService.class);

        // stubbing
        doNothing().when(mockService).logAction(anyString());

        // calling the method to verify interaction
        UserAction user = new UserAction(mockService);
        user.createUser("Saranya");

        // verifying the logging action
        verify(mockService).logAction("Created user : Saranya");
    }
}
