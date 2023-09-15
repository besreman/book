package com.guru.dev;

import com.guru.dev.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {

    public static void main(String[] args) {

        // 1-Creates an instance of book
        Book book = new Book("JEE", "the user guide for Jakarta enterprise edition", 300.0F, "1-867067-941-6", 780, false);


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookPersistenceUnit");
        EntityManager em = emf.createEntityManager();


        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(book);
        tx.commit();


        book = em.createNamedQuery("findBookH2G2", Book.class).getSingleResult();

        System.out.println("######### " + book.getDescription());

        
        em.close();
        emf.close();
    }
}
