package com.oyurtseven.services;

import com.oyurtseven.model.User;

import java.util.List;

public interface IUserService {
    public User save(User user);
    public List<User> getAllUserList();
    public User getUserById(int id);
}
