package com.library;

import com.library.service.BookService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load Spring context from applicationContext.xml
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve BookService bean from context
        BookService bookService = (BookService) context.getBean("bookService");

        // Call method to test AOP logging
        bookService.addBook("Setting Up New Maven Project.");

        // Close context to release resources
        context.close();
    }
}
