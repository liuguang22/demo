package com.example.demo.entity;

public class Sc {
        public static String sId;
        private String cId;
        private float cGrade;

        public Sc(String sId, String cId, float cGrade) {
            this.sId = sId;
            this.cId = cId;
            this.cGrade = cGrade;
        }

        public String getSId() {
            return sId;
        }

        public void setSId(String sId) {
            this.sId = sId;
        }

        public String getCId() {
            return cId;
        }

        public void setCId(String cId) {
            this.cId = cId;
        }

        public float getCGrad() {
            return cGrade;
        }

        public void setCGrad(float cGrade) {
            this.cGrade = cGrade;
        }
}
