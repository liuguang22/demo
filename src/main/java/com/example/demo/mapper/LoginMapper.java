package com.example.demo.mapper;

import com.example.demo.entity.Course;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
public interface LoginMapper {
    User getUserByUser_id(String user_id);

    List<Course> getAllCourse();

}
