package com.example;

public class AlertService {
    private final Notifier notifier;

    public AlertService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void triggerAlert() {
        notifier.sendAlert("Alert!");
    }
}
