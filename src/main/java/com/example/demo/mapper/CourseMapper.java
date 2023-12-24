package com.example.demo.mapper;

import com.example.demo.entity.Course;
import com.example.demo.entity.Sc;

import java.util.List;

public interface CourseMapper {
    //全部信息
    List<Course>  getAllCourse(String sId);
    List<Course>  getMyCourse(String sId);
    List<Course>  getMycj(String sId);

    //插入数据
    void insertCourse(Course course);
    void insertSc(Sc sc);
    void deleteSc(String sId,String cId);

}
