package com.lopputyo.lopputyo.data;

import java.io.Serializable;

public class Student implements Serializable {
    // Variables
    private String studentFirstName;
    private String studentLastName;
    private Integer studentAge;
    private Integer studentId;
    private static Integer studentIdCounter = 0;

    // Constructros
    public Student() {
    }

    public Student(String studentFirstName, String studentLastName, Integer studentAge) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentAge = studentAge;
        this.studentId = studentIdCounter++; // idCounter adds to the studentId
    }

    // Getters and setters
    // Set a student when the parameter is an object
    public void setStudentInfo(Student s) { 
        this.studentFirstName = s.studentFirstName;
        this.studentLastName = s.studentLastName;
        this.studentAge = s.studentAge;
        s.studentId = s.studentId + 1;
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
