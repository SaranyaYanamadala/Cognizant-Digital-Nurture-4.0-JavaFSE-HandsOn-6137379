package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String serviceId;
    private BookRepository bookRepository;

    // Constructor Injection (used for service ID)
    public BookService(String serviceId) {
        this.serviceId = serviceId;
        System.out.println("Constructor injection: serviceId = " + serviceId);
    }

    // Setter Injection (used for repository)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter injection: BookRepository injected");
    }

    public void addBook(String title) {
        System.out.println("[" + serviceId + "] Adding book: " + title);
        bookRepository.saveBook(title);
    }
}