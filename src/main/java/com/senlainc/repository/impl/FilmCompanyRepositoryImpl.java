package com.senlainc.repository.impl;

import com.senlainc.di.AbstractRepository;
import com.senlainc.model.FilmCompany;
import com.senlainc.repository.FilmCompanyRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class FilmCompanyRepositoryImpl extends AbstractRepository implements FilmCompanyRepository {

    @Transactional
    @Override
    public void save(FilmCompany filmCompany) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(filmCompany);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public void update(FilmCompany filmCompanyMerge, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        FilmCompany filmCompanyOld = findById(id);
        filmCompanyOld.setCompanyName(filmCompanyMerge.getCompanyName());
        filmCompanyOld.setFilms(filmCompanyMerge.getFilms());
        em.merge(filmCompanyOld);
        em.getTransaction().commit();
    }

    @Transactional
    @Override
    public FilmCompany findById(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        FilmCompany filmCompany = em.find(FilmCompany.class, id);
        em.getTransaction().commit();
        return filmCompany;
    }

    @Transactional
    @Override
    public void delete(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        FilmCompany deleteActor = em.find(FilmCompany.class, id);
        em.remove(deleteActor);
        em.getTransaction().commit();
    }
}
