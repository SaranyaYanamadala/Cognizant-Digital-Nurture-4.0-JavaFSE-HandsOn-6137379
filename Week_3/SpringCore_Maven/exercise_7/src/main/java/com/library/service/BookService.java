package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String serviceId;
    private BookRepository bookRepository;

    // Constructor injection for a simple value (like a service ID)
    public BookService(String serviceId) {
        this.serviceId = serviceId;
        System.out.println("Constructor injection: serviceId = " + serviceId);
    }

    // Setter for repository (dependency injection of another bean)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter injection: BookRepository injected");
    }

    public void addBook(String title) {
        System.out.println("[" + serviceId + "] Adding book: " + title);
        bookRepository.saveBook(title);
    }
}