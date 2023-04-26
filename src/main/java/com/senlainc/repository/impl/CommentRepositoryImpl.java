package com.senlainc.repository.impl;

import com.senlainc.di.AbstractRepository;
import com.senlainc.model.Comment;
import com.senlainc.repository.CommentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class CommentRepositoryImpl extends AbstractRepository implements CommentRepository {

    @Transactional
    @Override
    public void save(Comment comment) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(comment);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public void update(Comment commentMerge, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Comment commentOld = findById(id);
        commentOld.setText(commentMerge.getText());
        commentOld.setReview(commentMerge.getReview());
        em.merge(commentOld);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public Comment findById(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Comment comment = em.find(Comment.class, id);
        em.getTransaction().commit();
        return comment;
    }

    @Transactional
    @Override
    public void delete(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Comment deleteActor = em.find(Comment.class, id);
        em.remove(deleteActor);
        em.getTransaction().commit();

    }
}
