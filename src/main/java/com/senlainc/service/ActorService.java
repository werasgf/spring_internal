package com.senlainc.service;

import com.senlainc.model.Actor;

public interface ActorService {
    void save(Actor actor);
    void update(Actor actor, int id);
    Actor getActorById(int id);
    void delete(int id);
}
