package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourseList();
    List<Course> xuanke();
    List<Course> tuike();
    List<Course> grade();


    void addsc(String sId,String cId);
    void deletesc(String sId,String cId);

}
