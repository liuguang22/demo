package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Spe;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;

import java.util.List;

public interface AdminService {
    //学生
    List<Student> getStudentList();
    List<Student> NewStudent();
    List<Student> delStudent();
    //教师
    List<Teacher> getTeacherList();
    List<Teacher> NewTeacher();
    List<Teacher> delTeacher();
    //查看已开设课程
    List<Course> getCourseList();
    //查看已有专业
    List<Spe> getSpeList();


    void addstudent(String studentid);
    void delstudent(String studentid);
    void deluser(String studentid);

    void delteacher(String teacherid);
}
