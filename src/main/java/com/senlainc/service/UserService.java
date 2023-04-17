package com.senlainc.service;

import com.senlainc.model.UserImpl;

import java.util.List;

public interface UserService {

    void saveUser(UserImpl user);

    UserImpl getUser(int id);

    void update(UserImpl user);

    void remove(int id);

    List<UserImpl> getAll();
}
