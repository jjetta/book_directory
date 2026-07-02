package com.jjetta.book_directory.controller;

import com.jjetta.book_directory.model.Book;
import com.jjetta.book_directory.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
}
