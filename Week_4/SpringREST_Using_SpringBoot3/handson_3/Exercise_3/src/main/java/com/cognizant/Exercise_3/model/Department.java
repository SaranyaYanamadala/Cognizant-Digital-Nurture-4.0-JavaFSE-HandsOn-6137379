package com.cognizant.Exercise_3.model;

public class Department {
    private int id;
    private String name;

    public Department() {
        super();
    }

    public Department(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}