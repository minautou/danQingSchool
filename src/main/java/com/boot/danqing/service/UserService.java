package com.boot.danqing.service;

import com.boot.danqing.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAlluser()throws Exception;

}
