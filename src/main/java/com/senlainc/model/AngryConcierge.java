package com.senlainc.model;

public class AngryConcierge implements Concierge {
    @Override
    public void makePeopleLeaveCinema() {
        System.out.println("Без билета не впущу!");
    }
}
