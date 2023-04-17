package com.senlainc.model;

import com.senlainc.di.InjectByType;

import javax.annotation.PostConstruct;

public class ConciergeImpl implements Concierge {

    @InjectByType
    private Recommendator recommendator;

    @PostConstruct
    public void init() {
        System.out.println(recommendator.getClass());
    }

    @Override
    public void makePeopleLeaveCinema() {
        System.out.println("Ваш билетик, пожалуйста!");
    }
}
