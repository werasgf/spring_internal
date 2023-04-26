package com.senlainc.service.impl;

import com.senlainc.model.Actor;
import com.senlainc.repository.ActorRepository;
import com.senlainc.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorRepository actorRepository;

    @Override
    public void save(Actor actor) {
        actorRepository.save(actor);
    }

    @Override
    public void update(Actor actor, int id) {
        actorRepository.update(actor, id);
    }

    @Override
    public Actor getActorById(int id) {
        return actorRepository.findById(id);
    }

    @Override
    public List<Actor> getAll() {
        return actorRepository.findAll();
    }

    @Override
    public void delete(int id) {
        actorRepository.delete(id);
    }
}
