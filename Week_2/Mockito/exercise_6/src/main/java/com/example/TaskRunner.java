package com.example;

public class TaskRunner {
    private final LoggerService logger;

    public TaskRunner(LoggerService logger) {
        this.logger = logger;
    }

    public void runTask() {
        logger.start();
        logger.process();
        logger.end();
    }
}
