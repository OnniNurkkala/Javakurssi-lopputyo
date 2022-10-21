package com.lopputyo.lopputyo.data;

public class Course {
    // Variables
    protected String courseName;
    protected String courseTeacher;
    protected String courseLenght;


    // Constructros
    public Course() {

    }

    public Course(String courseName, String courseTeacher, String courseLenght) {
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.courseLenght = courseLenght;
    }

    // Getters and setters
    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTeacher() {
        return this.courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseLenght() {
        return this.courseLenght;
    }

    public void setCourseLenght(String courseLenght) {
        this.courseLenght = courseLenght;
    }
}