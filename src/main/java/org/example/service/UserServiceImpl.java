package org.example.service;

import org.example.dao.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public String sayUserName() {
        return "User";
    }

    @Transactional
    public void registerUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
