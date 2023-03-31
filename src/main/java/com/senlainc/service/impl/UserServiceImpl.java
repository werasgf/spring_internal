package com.senlainc.service.impl;

import com.senlainc.dao.impl.UserDAOImpl;
import com.senlainc.di.Singleton;
import com.senlainc.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Singleton
public class UserServiceImpl {

    @Transactional
    public static void saveUser(User user) {
        UserDAOImpl.save(user);
    }

    @Transactional
    public static User getUser(int id) {
        return UserDAOImpl.get(id);
    }

    @Transactional
    public static void update(User user){
        UserDAOImpl.update(user);
    }

    @Transactional
    public static void remove(int id) {
        UserDAOImpl.remove(id);
    }

    @Transactional
    public static List<User> getAll() {
        return UserDAOImpl.getAll();
    }
}
