package com.guru.dev;

import com.guru.dev.controller.BookController;
import com.guru.dev.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {

    public static void main(String[] args) {

        BookController bookController = new BookController();

        // 1-Creates an instance of book
        Book book = new Book("JEE", "the user guide for Jakarta enterprise edition", 300.0F, "1-867067-941-6", 780, false);
        Book bookRetrieved = bookController.addBook(book);

        System.out.println("The book "+bookRetrieved.getTitle()+" has added to the database!");

    }
}
