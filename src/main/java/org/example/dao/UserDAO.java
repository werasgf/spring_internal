package org.example.dao;

import org.example.domain.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAO {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    static EntityManager em = emf.createEntityManager();

    public static void save(User user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    public static void getByUserName(User user) {
        em.getTransaction().begin();
        em.createQuery("FROM users WHERE Name = " + user.getName());
        em.getTransaction().commit();
    }

    public static void update(User user) {

    }

    public static void remove(User user) {
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();
    }

}
