package com.guru.dev.controller;

import com.guru.dev.model.Book;
import com.guru.dev.service.BookService;

public class BookController {

    BookService bookService;

    public BookController(){
        bookService = new BookService();
    }

    public Book addBook(Book book){
        return this.bookService.addBook(book);
    }


}
