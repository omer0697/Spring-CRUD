package com.oyurtseven.services.impl;

import com.oyurtseven.dto.DtoUser;
import com.oyurtseven.dto.DtoUserIU;
import com.oyurtseven.model.User;
import com.oyurtseven.repository.UserRepository;
import com.oyurtseven.services.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public DtoUser save(DtoUserIU dtoUserIU) {
        DtoUser response = new DtoUser();
        User user = new User();

        BeanUtils.copyProperties(dtoUserIU,user);
        User savedUser = userRepository.save(user);
        BeanUtils.copyProperties(savedUser,response);
        // Copy saved entity back to response DTO

        return response;
    }


    @Override
    public List<DtoUser> getAllUserList() {
        List<DtoUser> responseList = new ArrayList<>();
        List<User> userList = userRepository.findAll();
        for (User user : userList) {
            DtoUser dtoUser = new DtoUser();
            BeanUtils.copyProperties(user,dtoUser);
            responseList.add(dtoUser);
        }
        return responseList;
    }

    @Override
    public DtoUser getUserById(int id) {
        DtoUser dtoUser = new DtoUser();
        User responseUser = userRepository.findById(id).orElse(null);
        if (responseUser != null) {
            BeanUtils.copyProperties(responseUser,dtoUser);
        }
        return dtoUser;
    }
}
