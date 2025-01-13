package com.oyurtseven.controller;

import com.oyurtseven.dto.DtoUser;
import com.oyurtseven.dto.DtoUserIU;
import com.oyurtseven.model.User;

import java.util.List;

public interface IUserController {
    public DtoUser save(DtoUserIU dtoUserIU);
    public List<DtoUser> getAllUserList();
    public DtoUser getUserById(int id);
}
