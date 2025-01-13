package com.oyurtseven.controller;

import com.oyurtseven.model.User;

import java.util.List;

public interface IUserController {
    public User save(User student);
    public List<User> getAllUserList();
    public User getUserById(int id);
}
