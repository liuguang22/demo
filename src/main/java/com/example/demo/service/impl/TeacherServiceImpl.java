package com.example.demo.service.impl;

import com.example.demo.entity.Course;
import com.example.demo.entity.Fenxi;
import com.example.demo.entity.Sc;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TeacherService")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Course> getT_Course(String tId) {
        System.out.println("CourseService");
        List<Course> courses = teacherMapper.getTCourse(tId);
        System.out.println(courses);
        return courses;
    }

    @Override
    public List<Course> getT_student(String tId) {
        System.out.println("CourseService");
        List<Course> courses = teacherMapper.getT_student(tId);
        System.out.println(courses);
        return courses;
    }

    @Override
    public List<Course> getT_sfx(String tId) {
        System.out.println("CourseService");
        List<Course> courses = teacherMapper.getT_sfx(tId);
        System.out.println(courses);
        return courses;
    }

    @Override
    public List<Fenxi> getT_sfenxi(String cId) {
        System.out.println("CourseService");
        List<Fenxi> fenxi = teacherMapper.getFenxi(cId);
        System.out.println(fenxi);
        return fenxi;
    }


    @Override
    public List<Sc> getT_sInfo(String cId,String tId) {
        System.out.println("CourseService");
        List<Sc> sc = teacherMapper.getTsInfo(cId,tId);
        System.out.println(sc);
        return sc;
    }




    @Override
    public List<Sc> getT_update(String cId,String tId) {
        System.out.println("CourseService");
        List<Sc> sc = teacherMapper.getTupdate(cId,tId);
        System.out.println(sc);
        return sc;
    }
    @Override
    public void getT_newG(Sc sc) {
        System.out.println("修改的服务实现");
        teacherMapper.getTng(sc);
        System.out.println(sc);
    }
}
