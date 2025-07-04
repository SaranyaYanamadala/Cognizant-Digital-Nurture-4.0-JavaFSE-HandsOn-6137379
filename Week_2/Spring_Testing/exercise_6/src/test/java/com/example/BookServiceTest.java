package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testGetBookById_NotFound() {
        // Arrange
        Long bookId = 101L;
        when(bookRepository.findById(bookId)).thenReturn(Optional.empty());

        // Act
        Book result = bookService.getBookById(bookId);

        // Assert
        assertNull(result, "Expected null when book is not found");
    }
}

