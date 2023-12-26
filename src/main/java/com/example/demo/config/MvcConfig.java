package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig  implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 使用addViewController方法将路径映射到视图名称
        registry.addViewController("/").setViewName("login");
        //registry.addViewController("/toAdd").setViewName("course_add");
    }

}
