package com.oyurtseven.controller.impl;

import com.oyurtseven.controller.IUserController;
import com.oyurtseven.model.User;
import com.oyurtseven.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserControllerImpl implements IUserController {

    @Autowired
    private IUserService userService;

    @PostMapping(path = "/save")
    @Override
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping(path = "/all")
    @Override
    public List<User> getAllUserList() {
        return userService.getAllUserList();
    }

    @GetMapping(path = "/{id}")
    @Override
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
