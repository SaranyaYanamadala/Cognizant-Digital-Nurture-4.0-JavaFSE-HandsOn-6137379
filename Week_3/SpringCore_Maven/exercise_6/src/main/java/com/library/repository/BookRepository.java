package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository  // Marks this class as a Spring-managed bean (DAO layer)
public class BookRepository {
    public void saveBook(String title) {
        System.out.println("Book saved: " + title);
    }
}