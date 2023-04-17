package com.senlainc.dao;

import com.senlainc.model.UserImpl;

import java.util.List;

public interface UserDAO {
    void save(UserImpl user);

    UserImpl get(int id);

    void update(UserImpl user);

    void remove(int id);

    List<UserImpl> getAll();
}
