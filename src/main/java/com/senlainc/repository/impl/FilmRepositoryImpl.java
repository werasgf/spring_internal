package com.senlainc.repository.impl;

import com.senlainc.di.AbstractRepository;
import com.senlainc.model.Film;
import com.senlainc.repository.FilmRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class FilmRepositoryImpl extends AbstractRepository implements FilmRepository {

    @Transactional
    @Override
    public void save(Film film) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(film);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public void update(Film filmMerge, int id) {
        EntityManager em = getEntityManager();
        Film filmOld = findById(id);
        filmOld.setFilmCompany(filmMerge.getFilmCompany());
        filmOld.setActors(filmMerge.getActors());
        filmOld.setGenres(filmMerge.getGenres());
        filmOld.setReviews(filmMerge.getReviews());
        filmOld.setTitle(filmMerge.getTitle());
        filmOld.setYear(filmMerge.getYear());
        em.merge(filmOld);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public Film findById(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Film film = em.find(Film.class, id);
        em.getTransaction().commit();
        return film;
    }

    @Override
    public void delete(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Film deleteActor = em.find(Film.class, id);
        em.remove(deleteActor);
        em.getTransaction().commit();
    }
}
