package com.senlainc.repository.impl;

import com.senlainc.di.AbstractRepository;
import com.senlainc.model.Genre;
import com.senlainc.repository.GenreRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class GenreRepositoryImpl extends AbstractRepository implements GenreRepository {

    @Transactional
    @Override
    public void save(Genre genre) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(genre);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public void update(Genre genreMerge, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Genre genreOld = findById(id);
        genreOld.setGenre(genreMerge.getGenre());
        genreOld.setFilms(genreMerge.getFilms());
        em.merge(genreOld);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public Genre findById(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Genre genre = em.find(Genre.class, id);
        em.getTransaction().commit();
        return genre;
    }

    @Transactional
    @Override
    public void delete(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Genre deleteActor = em.find(Genre.class, id);
        em.remove(deleteActor);
        em.getTransaction().commit();
    }
}
