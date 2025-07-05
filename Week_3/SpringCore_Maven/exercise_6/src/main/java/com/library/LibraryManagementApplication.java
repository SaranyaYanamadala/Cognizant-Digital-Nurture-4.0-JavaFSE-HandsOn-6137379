package com.library;

import com.library.service.BookService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bookService bean automatically created and injected by Spring
        BookService bookService = context.getBean(BookService.class);

        bookService.addBook("Spring in Action");

        context.close();
    }
}