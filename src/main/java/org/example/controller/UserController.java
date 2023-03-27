package org.example.controller;

import org.example.di.Singleton;
import org.example.domain.model.User;
import org.example.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Singleton
public class UserController {

    @Autowired
    private UserService userService;

    public static void registerUser(User user) {
        UserService.registerUser(user);
    }

    public static void getByUserName(User user) {
        UserService.getUser(user);
    }

    public static void remove(User user) {
        UserService.remove(user);
    }
}
