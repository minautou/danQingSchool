package com.boot.danqing.dao;

import com.boot.danqing.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAlluser() throws Exception;

}
