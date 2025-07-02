package com.example;

public class NetworkService {
    private NetworkClient client;

    public NetworkService(NetworkClient client) {
        this.client = client;
    }

    public String connectToServer() {
        String result = client.connect();
        return "Connected to " + result;
    }
}
