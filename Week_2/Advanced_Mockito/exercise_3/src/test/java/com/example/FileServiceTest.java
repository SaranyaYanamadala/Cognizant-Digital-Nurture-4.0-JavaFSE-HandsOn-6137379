package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class FileServiceTest {
    
    @Test 
    public void testServiceWithMockFileIO() {
        // Mocking
        FileReader mockReader = mock(FileReader.class);
        FileWriter mockWriter = mock(FileWriter.class);

        // Stubbing
        when(mockReader.read()).thenReturn("Mock File Content");

        // Injecting the mock into FileService
        FileService service = new FileService(mockReader, mockWriter);

        // Testing the mock
        String result = service.processFile();
        assertEquals("Processed Mock File Content", result);

        // Verifying the interaction
        verify(mockWriter).write("Processed Mock File Content");

    }
}
