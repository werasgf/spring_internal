package org.example.starter;

import org.example.configuration.MyApplicationContextConfiguration;
import org.example.service.FilmService;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationContextConfiguration.class);
        FilmService filmService = context.getBean(FilmService.class);
        System.out.println(filmService.sayFilmName());

        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.sayUserName());
    }
}