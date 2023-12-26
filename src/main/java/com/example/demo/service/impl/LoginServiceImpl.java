package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.LoginMapper;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;
    @Override
    public Boolean login(User user) {
        System.out.println("LoginService");
        User user1 = loginMapper.getUserByUser_id(user.getUser_id());
        System.out.println(user1);
        if (user1 == null) {
            return false;
        }else return user1.getPassword().equals(user.getPassword());
    }
    @Override
    public String loginSf(String userId) {
        String sf = loginMapper.getUserByUser_sf(userId);
        return sf;
    }

}
