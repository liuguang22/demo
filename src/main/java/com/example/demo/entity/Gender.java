package com.example.demo.entity;

public enum Gender {
    男("男"),
    女("女");

    private String label;

    Gender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
