package com.lopputyo.lopputyo.data;

public class Course {
    // Variables
    protected String courseName;
    protected String courseTeacher;
    protected String courseLenght;
    protected String courseId;


    // Constructros
    public Course() {
    }

    public Course(String courseName, String courseTeacher, String courseLenght, String courseId) {
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.courseLenght = courseLenght;
        this.courseId = courseId;
    }


    // Getters and setters
    public String getCourseId() {
        return this.courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

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