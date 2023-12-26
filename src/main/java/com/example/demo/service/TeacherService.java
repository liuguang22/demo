package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Fenxi;
import com.example.demo.entity.Sc;

import java.util.List;

public interface TeacherService {

    List<Course> getT_Course(String tId);

    List<Sc> getT_sInfo(String cId,String tId);
    List<Course> getT_student(String tId);

    List<Course> getT_sfx(String tId);

    List<Fenxi> getT_sfenxi(String cId);

    List<Sc> getT_update(String cId, String tId);

    void getT_newG(Sc sc);
}
