package com.boot.danqing.dao;

import com.boot.danqing.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {

    List<Teacher> getAllTeacher() throws Exception;

    List<Teacher> getPageTeacher(int page, int limit) throws Exception;

}
