package com.senlainc.controller;

import com.senlainc.model.User;
import com.senlainc.service.UserService;
import com.senlainc.service.impl.UserServiceImpl;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Component("userController")
@NoArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService = new UserServiceImpl();

    public void saveUser(User user) {
        userService.saveUser(user);
    }

    @GetMapping("/get-user")
    public User get(int id) {
        return userService.getUser(id);
    }

    public void update(User user) {
        userService.update(user);
    }

    public void remove(int id) {
        userService.remove(id);
    }

    @GetMapping("/get-all-user")
    public List<User> getAll() {
        return userService.getAll();
    }
}
