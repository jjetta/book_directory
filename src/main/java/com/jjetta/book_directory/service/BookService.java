package com.jjetta.book_directory.service;

import com.jjetta.book_directory.model.Book;
import com.jjetta.book_directory.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {}

    public List<Book> getAllBooks() {}

    public Book getBookById(Long id) {}

    public Book updateBook(Long id, Book bookDetails) {}

    public void deleteBook(Long id) {}



}
