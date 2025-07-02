package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class AlertServiceTest {
    
    @Test 
    void testSendAlertException() {
        // mocking
        Notifier mockNotifier = mock(Notifier.class);

        // stubbing
        doThrow(new RuntimeException("Alert Failed")).when(mockNotifier).sendAlert("Alert!");

        // Injecting mock into service
        AlertService service = new AlertService(mockNotifier);

        // Assert exception
        assertThrows(RuntimeException.class, service::triggerAlert);

        // Verifying the method interaction
        verify(mockNotifier).sendAlert("Alert!");
    }
}
