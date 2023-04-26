package com.senlainc;

import com.senlainc.configuration.MyConfig;
import com.senlainc.model.Actor;
import com.senlainc.service.ActorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        ActorService actorService = context.getBean(ActorService.class);
        Actor actor1 = new Actor("act 1");
        Actor actor3 = new Actor("act 3");
        Actor actor2 = new Actor("act 2");
        actorService.save(actor1);
        actorService.save(actor2);
        actorService.save(actor3);

        List<Ac>
//       actor.setActorName("act 123");
//        actorService.update(actor,1);
//        System.out.println(actorService.getActorById(1));
//        actorService.delete(1);

    }
}