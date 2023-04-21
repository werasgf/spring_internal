package com.senlainc.repository.impl;

import com.senlainc.di.AbstractRepository;
import com.senlainc.model.Actor;
import com.senlainc.repository.ActorRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class ActorRepositoryImpl extends AbstractRepository implements ActorRepository {

    private static final String HQL_GET_ALL = "select id from actors";

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
    public List<Actor> findAll() {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Set<Actor> actorSet = new HashSet<>(em.createQuery(HQL_GET_ALL).getResultList());
        List<Actor> actors = new ArrayList<>(actorSet);
        em.getTransaction().commit();
        return actors;
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
