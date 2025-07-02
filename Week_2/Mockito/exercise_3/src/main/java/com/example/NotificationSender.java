package com.example;

public class NotificationSender {
    private final MessageService service;

    public NotificationSender(MessageService service) {
        this.service = service;
    }

    public void notifyUser(String user) {
        service.sendMessages(user, "Hi!");
    }
}
