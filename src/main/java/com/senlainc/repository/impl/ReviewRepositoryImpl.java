package com.senlainc.repository.impl;

import com.senlainc.di.AbstractRepository;
import com.senlainc.model.Review;
import com.senlainc.repository.ReviewRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class ReviewRepositoryImpl extends AbstractRepository implements ReviewRepository {

    @Transactional
    @Override
    public void save(Review review) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(review);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public void update(Review reviewMerge, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Review reviewOld = findById(id);
        reviewOld.setFilms(reviewMerge.getFilms());
        reviewOld.setRating(reviewMerge.getRating());
        reviewOld.setComment(reviewMerge.getComment());
        em.merge(reviewOld);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public Review findById(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Review review = em.find(Review.class, id);
        em.getTransaction().commit();
        return review;
    }

    @Transactional
    @Override
    public void delete(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Review deleteActor = em.find(Review.class, id);
        em.remove(deleteActor);
        em.getTransaction().commit();
    }
}
