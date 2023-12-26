package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Spe;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
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

    //添加学生
    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String NewStudent(Model model){
        System.out.println("获取学生列表");
        List<Student> students = adminService.NewStudent();
        students.forEach(System.out::println);
        model.addAttribute("students", students);
        return "student/tuike";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@PathVariable("sId") String studentid){
        System.out.println("添加学生");
        adminService.addstudent(studentid);
        return "redirect:/addStudent";
    }

    //删除学生
    @RequestMapping(value = "/delStudent", method = RequestMethod.POST)
    public String delStudent(Model model){
        System.out.println("获取学生列表");
        List<Student> students = adminService.delStudent();
        students.forEach(System.out::println);
        model.addAttribute("students", students);
        return "admin/deleteStudent";
    }

    @RequestMapping(value = "/student/{sId}", method = RequestMethod.POST)
    public String delStudent(@PathVariable("sId") String studentid){
        System.out.println("删除学生");
        adminService.delstudent(studentid);
        adminService.deluser(studentid);
        return "/admin/managerstudent";
    }

    //查看学生
    @RequestMapping(value = "/adminstudentlist", method = RequestMethod.GET)
    public String getStudentList(Model model){
        System.out.println("获取学生列表");
        List<Student> students = adminService.getStudentList();
        students.forEach(System.out::println);
        model.addAttribute("students", students);
        return "admin/adminStudentlist";
    }

    //修改学生
    @RequestMapping(value = "/adminstudentlist", method = RequestMethod.POST)
    public String updateStudent(Model model){
        System.out.println("修改学生");
        List<Student> students = adminService.getStudentList();
        students.forEach(System.out::println);
        model.addAttribute("students", students);
        return "admin/adminStudentlist";
    }

    @RequestMapping(value = "/managerteacher")
    public String managerteacher(){
        System.out.println("管理教师信息");
        return "/admin/managerteacher";
    }

    //删除教师
    @RequestMapping(value = "/delTeacher", method = RequestMethod.POST)
    public String delTeacher(Model model){
        System.out.println("获取教师列表");
        List<Teacher> teachers = adminService.delTeacher();
        teachers.forEach(System.out::println);
        model.addAttribute("teachers", teachers);
        return "admin/deleteStudent";
    }

    @RequestMapping(value = "/teacher/{tId}", method = RequestMethod.POST)
    public String delTeacher(@PathVariable("tId") String teacherid){
        System.out.println("删除教师");
        adminService.delteacher(teacherid);
        adminService.deluser(teacherid);
        return "/admin/managerteacher";
    }

    //查看教师
    @RequestMapping(value = "/adminteacherlist", method = RequestMethod.GET)
    public String getTeacherList(Model model){
        System.out.println("获取教师列表");
        List<Teacher> teachers = adminService.getTeacherList();
        teachers.forEach(System.out::println);
        model.addAttribute("teachers", teachers);
        return "admin/adminTeacherlist";
    }

    @RequestMapping(value = "/managercourse")
    public String managercourse(){
        System.out.println("管理课程信息");
        return "/admin/managercourse";
    }

    @RequestMapping(value = "/managerspe")
    public String managerspe(){
        System.out.println("管理专业信息");
        return "/admin/managerspe";
    }

    @RequestMapping(value = "/adminSpelist", method = RequestMethod.GET)
    public String getSpeList(Model model){
        System.out.println("获取专业列表");
        List<Spe> spes = adminService.getSpeList();
        spes.forEach(System.out::println);
        model.addAttribute("spes", spes);
        return "admin/adminSpelist";
    }

}
