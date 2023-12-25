package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private String cId;
    private String cName;
    private String cCredit;
    private int rId;
    private String tId;
    private String tName;
    private String tTime;
    private float cGrade;
}
