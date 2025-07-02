package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationSenderTest {
    
    @Test 
    void testSendMsgWithSpecificArg() {
        // creating the mock obejct
        MessageService mockService = mock(MessageService.class);

        // calling the method with arguments
        NotificationSender sender = new NotificationSender(mockService);
        sender.notifyUser("saranya@gmail.com");

        // verifying the interaction
        verify(mockService).sendMessages("saranya@gmail.com", "Hi!");
    }
}
