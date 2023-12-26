package com.example.demo.mapper;

import com.example.demo.entity.Course;
import com.example.demo.entity.Fenxi;
import com.example.demo.entity.Sc;

import java.util.List;

public interface TeacherMapper {
    List<Course> getTCourse(String tId);
    List<Sc> getTsInfo(String cId, String tId);
    List<Course> getT_student(String tId);
    List<Course> getT_sfx(String tId);
    List<Fenxi> getFenxi(String cId);
    void getTng(Sc sc);
    List<Sc> getTgrade(String sId,String cId,float cGrade);
    List<Sc> getTupdate(String cId, String tId);
}
