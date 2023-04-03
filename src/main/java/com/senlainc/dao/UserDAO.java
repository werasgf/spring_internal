package com.senlainc.dao;

import com.senlainc.model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);

    User get(int id);

    void update(User user);

    void remove(int id);

    List<User> getAll();
}
