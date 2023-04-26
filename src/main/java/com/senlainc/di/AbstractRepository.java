package com.senlainc.di;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractRepository {
    public EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        return emf.createEntityManager();
    }
}
