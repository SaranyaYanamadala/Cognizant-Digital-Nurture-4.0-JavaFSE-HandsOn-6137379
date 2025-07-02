package com.example;

public class MyService {
    private final ExternalAPI api;

    public MyService(ExternalAPI api) {
        this.api = api;
    }

    public String getCombinedData() {
        String first = api.fetchData();
        String second = api.fetchData();

        return first + " & " + second;
    }
}
