package com.oyurtseven.controller.impl;

import com.oyurtseven.controller.IUserController;
import com.oyurtseven.dto.DtoUser;
import com.oyurtseven.dto.DtoUserIU;
import com.oyurtseven.model.User;
import com.oyurtseven.services.IUserService;
import jakarta.validation.Valid;
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
    public DtoUser save(@RequestBody @Valid DtoUserIU dtoUserIU) {
        return userService.save(dtoUserIU);
    }

    @GetMapping(path = "/all")
    @Override
    public List<DtoUser> getAllUserList() {
        return userService.getAllUserList();
    }

    @GetMapping(path = "/{id}")
    @Override
    public DtoUser getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
