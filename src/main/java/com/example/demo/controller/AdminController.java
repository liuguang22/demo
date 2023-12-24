package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.AdminService;
import com.example.demo.service.CourseService;
import com.example.demo.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static com.example.demo.entity.Sc.sId;

public class AdminController {

    @Autowired
    AdminService adminService;
    @Autowired
    AdminMapper adminMapper;

    @RequestMapping(value = "/managerstudent")
    public String managerstudent(){
        System.out.println("管理学生信息");
        return "/admin/managerstudent";
    }

}
