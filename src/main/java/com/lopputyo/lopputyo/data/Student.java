package com.lopputyo.lopputyo.data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentFirstName;
    private String studentLastName;
    private Integer studentAge;
    private Integer studentId;
    public List <Student> students = new ArrayList<>();

    private static Integer studentIdCounter = 0;

    public Student(){
    }

    public Student(String studentFirstName,String studentLastName,Integer studentAge){
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentAge = studentAge;
        this.studentId = studentIdCounter++;

    }

    public void setStudentInfo(Student s) {
        this.studentFirstName = s.studentFirstName;
        this.studentLastName = s.studentLastName;
        this.studentAge = s.studentAge;
        //this.studentId = studentIdCounter++;

   
        //new Student(s);
        //students.add(s);
    }

    public List<Student> getStudents(){
        return this.students;
    }


    public String getStudentFirstName() {
        return this.studentFirstName;
    }
    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }
    public String getStudentLastName() {
        return this.studentLastName;
    }
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }
    public Integer getStudentAge() {
        return this.studentAge;
    }
    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }
    public Integer getStudentId() {
        return this.studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
