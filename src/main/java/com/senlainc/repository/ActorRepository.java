package com.senlainc.repository;

import com.senlainc.model.Actor;

import java.util.List;

public interface ActorRepository {
    public void save(Actor actor);
    public void update(Actor actor, int id);

    public Actor findById(int id);

    public List<Actor> findAll();

    public void delete(int id);
}
