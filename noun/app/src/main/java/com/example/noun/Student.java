package com.example.noun;

import java.util.ArrayList;

public class Student {
    private String studentname;
    private int studentage;
    private int studentphoto;
    private int studentGrade;
    public Student(String studentname, int studentage, int studentphoto, int studentGrade) {
        this.studentname = studentname;
        this.studentage = studentage;
        this.studentphoto = studentphoto;
        this.studentGrade = studentGrade;
    }


    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public int getStudentphoto() {
        return studentphoto;
    }

    public void setStudentphoto(int studentphoto) {
        this.studentphoto = studentphoto;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }


}