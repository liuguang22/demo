package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Spe;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    //修改学生信息
    @RequestMapping(value = "/update_student",method = RequestMethod.POST)
    public String update_student(@ModelAttribute @Valid Student student){
        adminService.updatestudent(student);
        System.out.println("管理学生信息--修改学生信息");
        return "admin/update_student";
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
        return "admin/deleteTeacher";
    }

    @RequestMapping(value = "/teacher/{tId}", method = RequestMethod.POST)
    public String delTeacher(@PathVariable("tId") String teacherid){
        System.out.println("删除教师");
        adminService.delteacher(teacherid);
        adminService.deluser1(teacherid);
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

   //新增课程
    @RequestMapping(value = "/openCourse",method = RequestMethod.GET)
    public String openCourse(Model model){
        System.out.println("开设课程");
        return "/admin/openCourse";
    }
    @RequestMapping(value = "/openCourse",method = RequestMethod.POST)
    public String openCourse(@ModelAttribute @Valid Course course){
        adminService.openCourse(course);
        System.out.println("添加课程成功");
        return "admin/openCourse";
    }

    //删除课程

    @RequestMapping(value = "/delCourse", method = RequestMethod.POST)
    public String delCourse(Model model){
        System.out.println("获取课程列表");
        List<Course> courses = adminService.delCourse();
        courses.forEach(System.out::println);
        model.addAttribute("courses", courses);
        return "admin/deleteCourse";
    }

    @RequestMapping(value = "/course3/{cId}", method = RequestMethod.POST)
    public String delCourse(@PathVariable("cId") String courseid){
        System.out.println("删除课程");
        adminService.delcourse(courseid);
        return "/admin/managercourse";
    }

    //查看课程

    @RequestMapping(value = "/adminCourselist", method = RequestMethod.GET)
    public String getCourseLists(Model model){
        System.out.println("获取课程列表");
        List<Course> courses = adminService.getCourseLists();
        courses.forEach(System.out::println);
        model.addAttribute("courses", courses);
        return "admin/adminCourselist";
    }

    @RequestMapping(value = "/managerspe")
    public String managerspe(){
        System.out.println("管理专业信息");
        return "/admin/managerspe";
    }

    //添加专业

    @RequestMapping(value = "/openSpe",method = RequestMethod.GET)
    public String openSpe(){
        return "/admin/openSpe";
    }
    @RequestMapping(value = "/openSpe",method = RequestMethod.POST)
    public String openSpe(@ModelAttribute @Valid Spe spe){
        adminService.openSpe(spe);
        System.out.println("添加专业成功");
        return "admin/admin";
    }

    //查看专业

    @RequestMapping(value = "/adminSpelist", method = RequestMethod.GET)
    public String getSpeList(Model model){
        System.out.println("获取专业列表");
        List<Spe> spes = adminService.getSpeList();
        spes.forEach(System.out::println);
        model.addAttribute("spes", spes);
        return "admin/adminSpelist";
    }

    //删除专业

    @RequestMapping(value = "/delSpe", method = RequestMethod.POST)
    public String delSpe(Model model){
        System.out.println("获取专业列表");
        List<Spe> spes = adminService.delSpe();
        spes.forEach(System.out::println);
        model.addAttribute("spes", spes);
        return "admin/deleteSpe";
    }

    @RequestMapping(value = "/spe/{speId}", method = RequestMethod.POST)
    public String delSpe(@PathVariable("speId") String speid){
        System.out.println("删除专业");
        adminService.delspe(speid);
        return "/admin/managerspe";
    }

    //修改专业

    @RequestMapping(value = "/update_spe", method = RequestMethod.GET)
    public String getspeList(Model model){
        System.out.println("获取专业列表");
        List<Spe> spes = adminService.getSpeList();
        spes.forEach(System.out::println);
        model.addAttribute("spes", spes);
        return "/admin/update_spe";
    }

    @RequestMapping(value = "/update_spe",method = RequestMethod.POST)
    public String updateSpe(@Valid  Spe spe){
        adminService.updateSpe(spe);
        System.out.println("修改专业信息");
        return "admin/admin";
    }

}
