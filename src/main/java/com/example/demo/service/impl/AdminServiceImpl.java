package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Student> NewStudent() {
        System.out.println("AdminService");
        List<Student> students = adminMapper.getAllStudent();
        System.out.println(students);
        return students;
    }

    @Override
    public List<Student> delStudent() {
        System.out.println("AdminService");
        List<Student> students = adminMapper.getAllStudent();
        System.out.println(students);
        return students;
    }

    @Override
    public void addstudent(String studentid){
        adminMapper.Newstudent(studentid);
    }
    public void delstudent(String studentid){
        adminMapper.deletestudent(studentid);
    }
    @Override
    public void deluser(String studentid) {
        adminMapper.deleteuser(studentid);
    }
    public void addteacher(String teacherid){
        adminMapper.Newteacher(teacherid);
    }
    public void delteacher(String teacherid){
        adminMapper.deleteteacher(teacherid);
    }

    @Override
    public List<Teacher> getTeacherList() {
        System.out.println("AdminService");
        List<Teacher> teachers = adminMapper.getAllTeacher();
        System.out.println(teachers);
        return teachers;
    }

    @Override
    public List<Teacher> NewTeacher() {
        System.out.println("AdminService");
        List<Teacher> teachers = adminMapper.getAllTeacher();
        System.out.println(teachers);
        return teachers;
    }

    @Override
    public List<Teacher> delTeacher() {
        System.out.println("AdminService");
        List<Teacher> teachers = adminMapper.getAllTeacher();
        System.out.println(teachers);
        return teachers;
    }

    @Override
    public List<Course> getCourseList() {
        return null;
    }

    @Override
    public List<Spe> getSpeList() {
        System.out.println("AdminService");
        List<Spe> Spe = adminMapper.getAllSpe();
        System.out.println(Spe);
        return Spe;
    }
}
