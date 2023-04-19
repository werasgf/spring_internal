package com.senlainc.repository;

import com.senlainc.model.Actor;

public interface ActorRepository {
    public void save(Actor actor);
    public void update(Actor actor, int id);

    public Actor findById(int id);

    public void delete(int id);
}
