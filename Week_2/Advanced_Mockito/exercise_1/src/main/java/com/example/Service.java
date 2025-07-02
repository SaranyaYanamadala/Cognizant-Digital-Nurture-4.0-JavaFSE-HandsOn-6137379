package com.example;

public class Service {
    private final Repository repo;

    public Service(Repository repo) {
        this.repo = repo;
    }

    public String processData() {
        String data = repo.getData();
        return "Processed " + data;
    }
}
