package com.mypro.student.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Student")
public class Student {

    @Id
    private Integer rollNo;
    private String name;
    private char gender;
    private String course;
    private String duration;
    private int fee;

    public Student(){}


    public Student(Integer rollNo, String name, char gender, String course, String duration, int fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.duration = duration;
        this.fee = fee;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", course='" + course + '\'' +
                ", duration='" + duration + '\'' +
                ", fee=" + fee +
                '}';
    }
}
