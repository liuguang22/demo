package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static com.example.demo.entity.Sc.sId;
import static com.example.demo.entity.Teacher.tId;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping("/")
    public String home() {
        return "login"; // 返回首页的视图名称
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        System.out.println("login get");
        return "login";
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam("user_id") String user_id,@RequestParam("password") String password, Model model) {
        System.out.println("login post");
        // 在这里进行用户名和密码的验证
        if (loginService.login(new User(user_id, password))) {
            System.out.println("登陆成功");
            if(loginService.loginSf(user_id).equals("s")){
                sId=user_id;
                return "redirect:/student";}
            else if(loginService.loginSf(user_id).equals("t")){
                tId=user_id;
//                System.out.println(tId);
                return "redirect:/teacher";
            }
            else if(loginService.loginSf(user_id).equals("g")){
                return "redirect:/admin/admin";
            }
            else{
                return "login";
            }// 用户验证成功，重定向到成功页面
        } else {
            model.addAttribute("error", "用户名或密码错误");
            System.out.println("用户名或密码错误");
            return "login"; // 用户验证失败，返回登录页面并显示错误消息
        }
    }


    //成功登录
    @RequestMapping(value = "/admin/admin")
    public String getSlist() {
        return "admin/admin";
    }
    @RequestMapping(value = "/student")
    public String getSslist() {
        return "student/list";
    }
    @RequestMapping(value = "/teacher")
    public String getTlist() {
        return "teacher/T_all";
    }

}
