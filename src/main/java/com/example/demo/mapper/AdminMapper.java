package com.example.demo.mapper;

import com.example.demo.entity.*;

import java.util.List;

public interface AdminMapper {
    //全部信息
    List<Student> getAllStudent();
    List<Teacher>  getAllTeacher();
    List<Spe>  getAllSpe();
    List<Course>  getAllCourses();

    //插入数据
    void Newstudent(String studentid);
    void deletestudent(String studentid);
    void deleteuser(String studentid);
    void Newteacher(String tescherid);
    void deleteteacher(String teacherid);
    void deleteuser1(String teacherid);
    void deletecourse(String courseid);
    void updateSpe(Spe spe);
    void NewSpe(Spe spe);
    void deletespe(String speid);
    void NewCourse(Course course);
    void updateStudent(Student student);


}
