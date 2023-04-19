package com.senlainc.repository;

import com.senlainc.model.User;

public interface UserRepository {
    public void save(User user);
    public void update(User user, int id);

    public User findById(int id);

    public void delete(int id);
}
