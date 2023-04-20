package com.senlainc.repository.impl;

import com.senlainc.di.AbstractRepository;
import com.senlainc.model.Subscription;
import com.senlainc.repository.SubscriptionRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class SubscriptionRepositoryImpl extends AbstractRepository implements SubscriptionRepository {

    @Transactional
    @Override
    public void save(Subscription subscription) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(subscription);
        em.getTransaction().commit();
    }

    @Override
    public void update(Subscription subscriptionMerge, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Subscription subscriptionOld = findById(id);
        subscriptionOld.setUser(subscriptionMerge.getUser());
        subscriptionOld.setFriend(subscriptionMerge.getFriend());
        em.getTransaction().commit();
    }

    @Override
    public Subscription findById(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Subscription subscription = em.find(Subscription.class, id);
        em.getTransaction().commit();
        return subscription;
    }

    @Override
    public void delete(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Subscription deleteSubscription = em.find(Subscription.class, id);
        em.remove(deleteSubscription);
        em.getTransaction().commit();
    }
}
