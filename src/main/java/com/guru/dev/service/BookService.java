package com.guru.dev.service;

import com.guru.dev.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookPersistenceUnit");
    EntityManager em = emf.createEntityManager();

    public Book addBook(Book book){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(book);
        tx.commit();


        Book bookRetrieved = em.createNamedQuery("findBookJEE", Book.class).getSingleResult();


        em.close();
        emf.close();

        return bookRetrieved;
    }
}
