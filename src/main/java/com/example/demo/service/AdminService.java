package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Spe;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;

import java.util.List;

public interface AdminService {
    //学生
    List<Student> getStudentList();

    //教师
    List<Teacher> getTeacherList();
    List<Teacher> delTeacher();
    //查看已开设课程
    List<Course> getCourseLists();
    List<Course> delCourse();
    List<Spe> delSpe();
    //查看已有专业
    List<Spe> getSpeList();

    List<Student> delStudent();
    void delstudent(String studentid);
    void deluser(String studentid);
    void updatestudent(Student student);

    void updateTeacher(Teacher teacher);
    void addteacher(Teacher teacher);
    void addstudent(Student student);

    void deluser1(String teacherid);
    void delteacher(String teacherid);

    void delcourse(String courseid);
    void openCourse(Course course);

    void openSpe(Spe spe);
    void delspe(String speid);
    void updateSpe(Spe spe);

}
