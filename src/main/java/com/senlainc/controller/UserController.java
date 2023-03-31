package com.senlainc.controller;

import com.senlainc.di.Singleton;
import com.senlainc.model.User;
import com.senlainc.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
