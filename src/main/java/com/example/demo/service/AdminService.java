package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Spe;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;

import java.util.List;

public interface AdminService {
    //查看全体学生
    List<Student> getStudentList();
    //查看教师
    List<Teacher> getTeachertList();
    //查看已开设课程
    List<Course> getCourseList();
    //查看已有专业
    List<Spe> getSpeList();


}
