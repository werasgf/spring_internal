package com.senlainc.dao.impl;

import com.senlainc.dao.UserDAO;
import com.senlainc.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.Persistence.createEntityManagerFactory;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
    @PersistenceUnit
    private final EntityManagerFactory emf = createEntityManagerFactory("my-persistence-unit");
    EntityManager em = emf.createEntityManager();

    @Override
    public void save(User user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    @Override
    public User get(int id) {
        return em.find(User.class, id);
    }

    @Override
    public void update(User user) {
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

    @Override
    public void remove(int id) {
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    @Override
    public List<User> getAll() {
        TypedQuery<User> namedQuery = em.createNamedQuery("User.getAll", User.class);
        return namedQuery.getResultList();
    }
}
