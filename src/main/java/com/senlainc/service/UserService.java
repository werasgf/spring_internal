package com.senlainc.service;

import com.senlainc.model.User;

public interface UserService {

    void saveUser(User user);

    void update(User user, int id);

    User getUserById(int id);

    void delete(int id);

}
