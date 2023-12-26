package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Sc {
        private String sId;
        private String cId;
        private float cGrade;
        private String sName;
        private String sSpe;

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
