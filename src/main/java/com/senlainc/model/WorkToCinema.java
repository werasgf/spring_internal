package com.senlainc.model;

import com.senlainc.di.InjectByType;

public class WorkToCinema {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Concierge concierge;


    public void start(Cinema cinema) {
        announcer.announce("фильм сейчас начинанётся!");
        concierge.makePeopleLeaveCinema();
        drivingEveryone(cinema);
        announcer.announce("берем новые билеты и идем смотреть фильм");
    }

    private void drivingEveryone(Cinema cinema){
        System.out.println("теперь все посмотрели фильм");
    }
}
