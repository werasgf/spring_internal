package com.senlainc;

import com.senlainc.configuration.MyConfig;
import com.senlainc.model.Actor;
import com.senlainc.service.ActorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        ActorService actorService = context.getBean(ActorService.class);
        Actor actor = new Actor("act");

        actorService.save(actor);
//       actor.setActorName("act 123");
//        actorService.update(actor,1);
//        System.out.println(actorService.getActorById(1));
//        actorService.delete(1);

    }
}