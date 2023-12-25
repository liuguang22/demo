package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static com.example.demo.entity.Sc.sId;

@Controller
public class CourseController {
    @Autowired
    CourseService courseService;
    @Autowired
    CourseMapper courseMapper;

    @RequestMapping(value = "/courseList", method = RequestMethod.GET)
    public String getCourseList(Model model){
        System.out.println("获取课程列表");
        List<Course> courses = courseService.getCourseList();
        courses.forEach(System.out::println);
        model.addAttribute("courses", courses);
        return "student/courseList";
    }

    @RequestMapping(value = "/xuanke", method = RequestMethod.GET)
    public String xuanke(Model model){
        System.out.println("获取课程列表");
        List<Course> courses = courseService.xuanke();
        courses.forEach(System.out::println);
        model.addAttribute("courses", courses);
        return "student/xuanke";
    }

    @RequestMapping(value = "/course/{cId}", method = RequestMethod.POST)
    public String xuanCourse(@PathVariable("cId") String cId){
        System.out.println("选课成功");
        courseService.addsc(sId,cId);
        return "redirect:/xuanke";
    }


    @RequestMapping(value = "/tuike", method = RequestMethod.GET)
    public String tuike(Model model){
        System.out.println("获取课程列表");
        List<Course> courses = courseService.tuike();
        courses.forEach(System.out::println);
        model.addAttribute("courses", courses);
        return "student/tuike";
    }

    @RequestMapping(value = "/course2/{cId}", method = RequestMethod.POST)
    public String tuiCourse(@PathVariable("cId") String cId){
        System.out.println("退课成功");
        courseService.deletesc(sId,cId);
        return "redirect:/tuike";
    }

    @RequestMapping(value = "/grade", method = RequestMethod.GET)
    public String grade(Model model){
        System.out.println("获取课程列表");
        List<Course> courses = courseService.grade();
        courses.forEach(System.out::println);
        model.addAttribute("courses", courses);
        return "student/grade";
    }

}
