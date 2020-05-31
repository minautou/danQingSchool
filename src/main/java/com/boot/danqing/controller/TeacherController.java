package com.boot.danqing.controller;

import com.boot.danqing.entity.Menu;
import com.boot.danqing.entity.Teacher;
import com.boot.danqing.entity.User;
import com.boot.danqing.entity.pojo.dataObject;
import com.boot.danqing.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ResponseBody
    @GetMapping(value="/getAllTeacher")
    public dataObject getAllTeacher(HttpServletRequest request) {
        dataObject data = new dataObject();
        int page = Integer.parseInt(request.getParameter("page"));
        int limit = Integer.parseInt(request.getParameter("limit"));
        List<Teacher> teacherList = new LinkedList<>();
        List<Teacher> allTeacher = new LinkedList<>();
        try {
            teacherList = teacherService.getPageTeacher(page, limit);
            allTeacher = teacherService.getAllTeacher();
        }catch (Exception e){
            System.out.println(e);
        }
        data.setCode("0");
        data.setCount(allTeacher.size());
        data.setData(teacherList);
        data.setMsg("");
        return data;
    }


}
