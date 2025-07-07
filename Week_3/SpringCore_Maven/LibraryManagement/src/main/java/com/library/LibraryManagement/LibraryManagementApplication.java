package com.library.LibraryManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String[] args) {
        System.out.println(">>> main() method started <<<");
        SpringApplication.run(LibraryManagementApplication.class, args);
    }
}