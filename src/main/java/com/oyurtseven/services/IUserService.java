package com.oyurtseven.services;

import com.oyurtseven.dto.DtoUser;
import com.oyurtseven.dto.DtoUserIU;
import com.oyurtseven.model.User;

import java.util.List;

public interface IUserService {
    public DtoUser save(DtoUserIU user);
    public List<DtoUser> getAllUserList();
    public DtoUser getUserById(int id);
}
