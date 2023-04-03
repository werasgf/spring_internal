package com.senlainc.service.impl;

import com.senlainc.dao.UserDAO;
import com.senlainc.dao.impl.UserDAOImpl;
import com.senlainc.model.User;
import com.senlainc.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO = new UserDAOImpl();

    public void saveUser(User user) {
        userDAO.save(user);
    }

    public User getUser(int id) {
        return userDAO.get(id);
    }

    public void update(User user){
        userDAO.update(user);
    }

    public void remove(int id) {
        userDAO.remove(id);
    }

    public List<User> getAll() {
        return userDAO.getAll();
    }
}
