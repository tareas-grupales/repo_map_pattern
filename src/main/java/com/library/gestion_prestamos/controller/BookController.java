package com.library.gestion_prestamos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.gestion_prestamos.dto.BookDTO;
import com.library.gestion_prestamos.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/available")
    public List<BookDTO> getAvailableBooks() {
        return bookService.getAvailableBooks();
    }

    @GetMapping("/borrowed")
    public List<BookDTO> getBorrowedBooks() {
        return bookService.getBorrowedBooks();
    }
}
