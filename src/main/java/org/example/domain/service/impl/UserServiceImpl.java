package org.example.domain.service.impl;

import org.example.dao.UserDAO;
import org.example.di.Singleton;
import org.example.domain.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Singleton
public class UserServiceImpl {

    @Transactional
    public static void saveUser(User user) {
        UserDAO.save(user);
    }

    @Transactional
    public static User getUser(int id) {
        return UserDAO.get(id);
    }

    @Transactional
    public static void update(User user){
        UserDAO.update(user);
    }

    @Transactional
    public static void remove(int id) {
        UserDAO.remove(id);
    }

    @Transactional
    public static List<User> getAll() {
        return UserDAO.getAll();
    }
}
