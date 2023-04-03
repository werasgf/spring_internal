package com.senlainc.service;

import com.senlainc.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    User getUser(int id);

    void update(User user);

    void remove(int id);

    List<User> getAll();
}
