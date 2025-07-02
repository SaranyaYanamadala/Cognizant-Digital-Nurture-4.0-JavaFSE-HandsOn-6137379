package com.example;

public class ApiService {
    private RestClient client;

    public ApiService(RestClient client) {
        this.client = client;
    }

    public String fetchData() {
        String data = client.getResponse();
        return "Fetched " + data;
    }
}