package com;

import com.example.ExternalAPI;

public class MyService {
    private ExternalAPI api;

    public MyService(ExternalAPI api) {
        this.api = api;
    }

    public String fetchData() {
        // This could be a real HTTP call
        return api.getData();
    }
}
