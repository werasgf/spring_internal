package org.example.starter;

import org.example.configuration.MyConfig;
import org.example.controller.UserController;
import org.example.domain.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = new User();
        user.setName("Bob");
        user.setEmail("bod@mail.com");
        UserController.registerUser(user);
        UserController.remove(user);
    }
}