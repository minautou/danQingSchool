package com.boot.danqing.service.impl;

import com.boot.danqing.dao.TeacherMapper;
import com.boot.danqing.entity.Teacher;
import com.boot.danqing.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getAllTeacher() throws Exception {
        List<Teacher> teachers = teacherMapper.getAllTeacher();
        return teachers;
    }

    @Override
    public List<Teacher> getPageTeacher(int page, int limit) throws Exception {
        int startIndex = (page-1) * limit;
        List<Teacher> teachers = teacherMapper.getPageTeacher(startIndex, limit);
        return teachers;
    }
}
