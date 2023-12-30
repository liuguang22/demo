package com.example.demo.mapper;

import com.example.demo.entity.*;

import java.util.List;

public interface AdminMapper {
    //全部信息
    List<Student> getAllStudent();
    void deletestudent(String studentid);
    void deleteuser(String studentid);
    List<Teacher>  getAllTeacher();
    List<Spe>  getAllSpe();
    List<Course>  getAllCourses();

    void deleteteacher(String teacherid);
    void deleteuser1(String teacherid);
    void deletecourse(String courseid);
    void updateSpe(Spe spe);
    void NewSpe(Spe spe);
    void deletespe(String speid);
    void NewCourse(Course course);
    void updateStudent(Student student);

    void NewStudentUser(Student student);

    void NewStudent(Student student);

    void NewTeacher(Teacher teacher);

    void NewTeacherUser(Teacher teacher);
    void updateTeacher(Teacher teacher);

    void updateCourse(Course course);


}
