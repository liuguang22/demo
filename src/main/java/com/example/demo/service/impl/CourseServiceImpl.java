package com.example.demo.service.impl;

import com.example.demo.entity.Course;
import com.example.demo.entity.Sc;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.demo.entity.quanju.ssId;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> getCourseList() {
        System.out.println("CourseService");
        List<Course> courses = courseMapper.getMyCourse(ssId);
        System.out.println(courses);
        return courses;
    }
    @Override
    public List<Course> xuanke() {
        System.out.println("xuanke");
        List<Course> courses = courseMapper.getAllCourse(ssId);
        System.out.println(courses);
        return courses;
    }
    @Override
    public List<Course> tuike() {
        System.out.println("tuike");
        List<Course> courses = courseMapper.getMyCourse(ssId);
        System.out.println(courses);
        return courses;
    }
    @Override
    public List<Course> grade() {
        System.out.println("grade");
        List<Course> courses = courseMapper.getMycj(ssId);
        System.out.println(courses);
        return courses;
    }

    @Override
    public void addsc(String sId,String cId) {
        Sc sc=new Sc(sId,cId,0);
        System.out.println(sId);
        System.out.println(cId);
        courseMapper.insertSc(sc);
    }

    @Override
    public void deletesc(String sId,String cId) {
        System.out.println(sId);
        System.out.println(cId);
        courseMapper.deleteSc(sId,cId);
    }

}
