package com.example;

public class UserAction {
    private final LoggingService logService;

    public UserAction(LoggingService logService) {
        this.logService = logService;
    }

    public void createUser(String username) {
        // creating user
        logService.logAction("Created user : " + username);
    }
}
