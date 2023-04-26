package com.senlainc.service.impl;

import com.senlainc.model.User;
import com.senlainc.repository.UserRepository;
import com.senlainc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(User user, int id) {
        userRepository.update(user, id);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }
}
