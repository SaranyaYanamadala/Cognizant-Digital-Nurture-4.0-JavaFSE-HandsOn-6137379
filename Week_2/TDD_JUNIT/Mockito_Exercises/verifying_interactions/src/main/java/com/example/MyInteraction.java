package com.example;

public class MyInteraction {
    private ExternalAPI api;

    public MyInteraction(ExternalAPI api) {
        this.api = api;
    }

    public String fetchData(String keyword) {
        return api.getData(keyword);
    }
}
