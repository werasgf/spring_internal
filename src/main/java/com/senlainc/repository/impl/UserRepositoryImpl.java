package com.senlainc.repository.impl;

import com.senlainc.di.AbstractRepository;
import com.senlainc.model.User;
import com.senlainc.repository.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class UserRepositoryImpl extends AbstractRepository implements UserRepository {

    @Transactional
    @Override
    public void save(User user) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public void update(User userMerge, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        User userOld = findById(id);
        userOld.setName(userMerge.getName());
        userOld.setEmail(userMerge.getEmail());
        userOld.setComments(userMerge.getComments());
        em.merge(userOld);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public User findById(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        em.getTransaction().commit();
        return user;
    }

    @Override
    public void delete(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        User deleteActor = em.find(User.class, id);
        em.remove(deleteActor);
        em.getTransaction().commit();
    }
}
