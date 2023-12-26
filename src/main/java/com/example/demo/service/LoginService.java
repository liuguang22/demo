package com.example.demo.service;

import com.example.demo.entity.User;

public interface LoginService {
    Boolean login(User user);
    String loginSf(String userId);
}

