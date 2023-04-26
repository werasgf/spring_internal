package com.senlainc.service;

import com.senlainc.model.Actor;

import java.util.List;

public interface ActorService {
    void save(Actor actor);
    void update(Actor actor, int id);
    Actor getActorById(int id);

    List<Actor> getAll();
    void delete(int id);
}
