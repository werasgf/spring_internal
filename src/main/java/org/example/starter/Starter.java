package org.example.starter;

import org.example.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Starter {
    public static void main(String[] args) {
/*
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        FilmService filmService = context.getBean(FilmService.class);
        System.out.println(filmService.sayFilmName());

        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.sayUserName());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        User user = new User();
        user.setName("Bob");
        user.setEmail("bod@mail.com");

        em.persist(user);

        em.getTransaction().commit();
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        User user = new User();
        user.setName("Bob");
        user.setEmail("bob@mail.ru");
        entityManager.persist(user);
        entityManager.getTransaction().commit();

        ((AbstractApplicationContext) context).close();


    }
}