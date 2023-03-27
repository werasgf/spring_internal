package org.example.domain.service;

import org.example.dao.UserDAO;
import org.example.di.Singleton;
import org.example.domain.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Singleton
public class UserService {

    @Transactional
    public static void registerUser(User user) {
        UserDAO.save(user);
    }

    @Transactional
    public static void getUser(User user) {
        UserDAO.getByUserName(user);
    }

    @Transactional
    public static void remove(User user) {
        UserDAO.remove(user);
    }
}
