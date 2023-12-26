package com.example.demo.mapper;

import com.example.demo.entity.*;

import java.util.List;

public interface AdminMapper {
    //全部信息
    List<Student> getAllStudent();
    List<Teacher>  getAllTeacher();
    List<Spe>  getAllSpe();
    List<Spe>  getAllCourse();

    //插入数据
    void insertCourse(Course course);
    void insertSc(Sc sc);
    void deleteSc(String sId,String cId);
    void Newstudent(String studentid);
    void deletestudent(String studentid);
    void deleteuser(String studentid);
    void Newteacher(String tescherid);
    void deleteteacher(String teacherid);
}
