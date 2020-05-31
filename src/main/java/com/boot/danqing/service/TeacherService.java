package com.boot.danqing.service;

import com.boot.danqing.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {

    List<Teacher> getAllTeacher() throws Exception;

    List<Teacher> getPageTeacher(int page,int limit) throws Exception;

}
