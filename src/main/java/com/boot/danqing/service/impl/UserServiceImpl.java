package com.boot.danqing.service.impl;

import com.boot.danqing.dao.UserMapper;
import com.boot.danqing.entity.User;
import com.boot.danqing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAlluser() throws Exception {
        return userMapper.getAlluser();
    }

}
