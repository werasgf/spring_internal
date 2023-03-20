package org.example.service;

import org.example.dao.User;

public interface UserService {
    String sayUserName();

    void registerUser(User user);
}
