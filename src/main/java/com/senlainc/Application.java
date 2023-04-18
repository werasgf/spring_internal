package com.senlainc;

import com.senlainc.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        em.createNamedQuery("CREATE TABLE comments (id INT, user_id INT, text VARCHAR(30))").executeUpdate();
        em.getTransaction().commit();
    }
}