package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Fenxi;
import com.example.demo.entity.Sc;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static com.example.demo.entity.quanju.ttId;
@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @Autowired
    TeacherMapper teacherMapper;

    @RequestMapping(value = "/T_course")
    public String getT_Course(Model model) {
        System.out.println("获取课程列表");
        List<Course> courses = teacherService.getT_Course(ttId);
        courses.forEach(System.out::println);
        model.addAttribute("courses", courses);
        return "teacher/T_course";
    }

    @RequestMapping(value = "/T_all")
    public String getT_all() {
        System.out.println("登录成功");
        return "teacher/T_all";
    }

    @RequestMapping(value = "/T_student", method = RequestMethod.GET)
    public String getT_student(Model model) {
        System.out.println("获取课程列表");
        List<Course> courses = teacherService.getT_student(ttId);
        courses.forEach(System.out::println);
        model.addAttribute("courses", courses);
        return "teacher/T_student";
    }

    @RequestMapping(value = "/T_sfx")
    public String getT_sfx(Model model) {
        System.out.println("获取分析1");
        List<Course> courses = teacherService.getT_sfx(ttId);
        courses.forEach(System.out::println);
        model.addAttribute("courses", courses);
        return "teacher/T_sfx";
    }

    @RequestMapping(value = "/T_sfenxi/{cId}",method= RequestMethod.POST)
    public String getT_sfenxi(@PathVariable("cId") String cId,Model model) {
        System.out.println("获取分析2");
        List<Fenxi> fenxi = teacherService.getT_sfenxi(cId);
        fenxi.forEach(System.out::println);
        model.addAttribute("fenxi", fenxi);
        return "teacher/T_sfenxi";
    }
    @RequestMapping(value = "/T_sInfo/{cId}",method= RequestMethod.POST)
    public String getT_sInfo(@PathVariable("cId") String cId, Model model) {
        System.out.println("获取学生信息列表");
        List<Sc> sc = teacherService.getT_sInfo(cId,ttId);
        sc.forEach(System.out::println);
        model.addAttribute("sc", sc);
        return "teacher/T_sInfo";
    }

    @RequestMapping(value = "/T_update/{cId}",method= RequestMethod.POST)
    public String getT_update(@PathVariable("cId") String cId, Model model) {
        System.out.println("修改学生成绩");
        List<Sc> sc = teacherService.getT_update(cId,ttId);
        sc.forEach(System.out::println);
        model.addAttribute("sc", sc);
        return "teacher/T_update";
    }

    @RequestMapping(value = "/ltwo")
    public String login(@RequestParam("cS") String sId, @RequestParam("cC") String cId, @RequestParam("cG") float cGrade, Model model) {
        System.out.println("进入修改");
        Sc sc=new Sc(sId,cId,cGrade);
        teacherService.getT_newG(sc);
        return "redirect:/T_student";

    }
}
