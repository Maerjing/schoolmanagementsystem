package com.wang.pojo;

import java.util.List;

public class StudentCource {
    private Integer studentId;

    private List<Cource> cources;

    private Double score;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public List<Cource> getCources() {
        return cources;
    }

    public void setCources(List<Cource> cources) {
        this.cources = cources;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentCource{" +
                "studentId=" + studentId +
                ", cources=" + cources +
                ", score=" + score +
                '}';
    }
}