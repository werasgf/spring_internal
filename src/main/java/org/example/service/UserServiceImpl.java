package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String sayUserName() {
        return "User";
    }
}
