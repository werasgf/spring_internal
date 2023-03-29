package org.example.controller;

import org.example.di.Singleton;
import org.example.domain.model.User;
import org.example.domain.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Singleton
public class UserController {

    public static void saveUser(User user) {
        UserServiceImpl.saveUser(user);
    }

    public static User get(int id) {
        return UserServiceImpl.getUser(id);
    }

    public static void update(User user) {
        UserServiceImpl.update(user);
    }

    public static void remove(int id) {
        UserServiceImpl.remove(id);
    }

    public static List<User> getAll() {
        return UserServiceImpl.getAll();
    }
}
