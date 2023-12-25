package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.demo.entity.Sc.sId;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    //查看教师
    //List<Teacher> getTeachertList();
    //查看已开设课程
    //List<Course> getCourseList();
    //查看已有专业
    //List<Spe> getSpeList();

    @Override
    public List<Student> getStudentList() {
        System.out.println("AdminService");
        List<Student> students = adminMapper.getAllStudent();
        System.out.println(students);
        return students;
    }

    @Override
    public List<Teacher> getTeachertList() {
        return null;
    }

    @Override
    public List<Course> getCourseList() {
        return null;
    }

    @Override
    public List<Spe> getSpeList() {
        return null;
    }
}
