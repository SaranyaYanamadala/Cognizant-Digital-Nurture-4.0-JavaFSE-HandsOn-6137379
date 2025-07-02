package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class TaskRunnerTest {
    
    @Test 
    void testMethodCallOrder() {
        // mocking
        LoggerService mockLogger = mock(LoggerService.class);

        // stubbing
        TaskRunner runner = new TaskRunner(mockLogger);
        runner.runTask();

        // verifying the method call order
        InOrder inOrder = inOrder(mockLogger);
        inOrder.verify(mockLogger).start();
        inOrder.verify(mockLogger).process();
        inOrder.verify(mockLogger).end();
    }
}
