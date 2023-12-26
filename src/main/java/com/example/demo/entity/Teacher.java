package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    public static String tId;
    private String tName;
    private String tSex;
    private int tAge;
    private String tSpe;
}
