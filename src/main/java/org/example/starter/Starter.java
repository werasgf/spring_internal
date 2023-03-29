package org.example.starter;

import org.example.configuration.MyConfig;
import org.example.controller.UserController;
import org.example.domain.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Starter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = new User();
        user.setName("Bob");
        user.setEmail("bod@mail.com");
        UserController.saveUser(user);
        System.out.println(UserController.get(user.getId()));
        user.setName("Rock");
        UserController.update(user);
        System.out.println(UserController.get(user.getId()));
        List<User> users = UserController.getAll();
        for (User u : users) {
            System.out.println(u);
        }
        UserController.remove(user.getId());
    }
}