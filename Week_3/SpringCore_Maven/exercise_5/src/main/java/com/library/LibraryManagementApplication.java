package com.library;

import com.library.service.BookService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load Spring container from applicationContext.xml
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Use the service
        bookService.addBook("Effective Java");

        // Close context
        context.close();
    }
}