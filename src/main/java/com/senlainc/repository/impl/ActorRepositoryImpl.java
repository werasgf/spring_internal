package com.senlainc.repository.impl;

import com.senlainc.di.AbstractRepository;
import com.senlainc.model.Actor;
import com.senlainc.repository.ActorRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class ActorRepositoryImpl extends AbstractRepository implements ActorRepository {

    @Transactional
    @Override
    public void save(Actor actor) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(actor);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public void update(Actor actorMerge, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Actor actorOld = findById(id);
        actorOld.setActorName(actorMerge.getActorName());
        em.merge(actorOld);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public Actor findById(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Actor actor = em.find(Actor.class, id);
        em.getTransaction().commit();
        return actor;
    }

    @Transactional
    @Override
    public void delete(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Actor deleteActor = em.find(Actor.class, id);
        em.remove(deleteActor);
        em.getTransaction().commit();
    }
}
