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


    @Override
    public List<Student> delStudent() {
        System.out.println("AdminService");
        List<Student> students = adminMapper.getAllStudent();
        System.out.println(students);
        return students;
    }

    @Override
    public List<Student> getStudentList() {
        System.out.println("AdminService");
        List<Student> students = adminMapper.getAllStudent();
        System.out.println(students);
        return students;
    }

    public void updatestudent(Student student){
        adminMapper.updateStudent(student);
    }


    @Override
    public List<Teacher> getTeacherList() {
        System.out.println("AdminService");
        List<Teacher> teachers = adminMapper.getAllTeacher();
        System.out.println(teachers);
        return teachers;
    }


    @Override
    public void addstudent(Student student){
        adminMapper.NewStudentUser(student);
        adminMapper.NewStudent(student);
    }


    @Override
    public void addteacher(Teacher teacher){
        adminMapper.NewTeacherUser(teacher);
        adminMapper.NewTeacher(teacher);
    }


    @Override
    public List<Teacher> delTeacher() {
        System.out.println("AdminService");
        List<Teacher> teachers = adminMapper.getAllTeacher();
        System.out.println(teachers);
        return teachers;
    }

    @Override
    public void openCourse(Course course){
        System.out.println("更新课程");
        adminMapper.NewCourse(course);
    }


    @Override
    public List<Course> getCourseLists() {
        System.out.println("AdminService");
        List<Course> Course = adminMapper.getAllCourses();
        System.out.println(Course);
        return Course;
    }

    @Override
    public List<Course> delCourse(){
        System.out.println("AdminService");
        List<Course> Course = adminMapper.getAllCourses();
        System.out.println(Course);
        return Course;
    }

    @Override
    public List<Spe> getSpeList() {
        System.out.println("AdminService");
        List<Spe> Spe = adminMapper.getAllSpe();
        System.out.println(Spe);
        return Spe;
    }

    @Override
    public List<Spe> delSpe(){
        System.out.println("AdminService");
        List<Spe> Spe = adminMapper.getAllSpe();
        System.out.println(Spe);
        return Spe;
    }

    @Override
    public void delstudent(String studentid){
        adminMapper.deletestudent(studentid);
    }
    @Override
    public void deluser(String studentid) {
        adminMapper.deleteuser(studentid);
    }

    @Override
    public void delteacher(String teacherid){
        adminMapper.deleteteacher(teacherid);
    }
    @Override
    public void deluser1(String teacherid){
        adminMapper.deleteuser1(teacherid);
    }
    @Override
    public void delcourse(String courseid){
        adminMapper.deletecourse(courseid);
    }
    public void updateTeacher(Teacher teacher){
        adminMapper.updateTeacher(teacher);
    }

    @Override
    public void openSpe(Spe spe) {
        adminMapper.NewSpe(spe);
    }
    @Override
    public void delspe(String speid){
        adminMapper.deletespe(speid);
    }
    @Override
    public void updateSpe(Spe spe) {
        adminMapper.updateSpe(spe);
    }

}
