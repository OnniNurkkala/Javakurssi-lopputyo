package com.lopputyo.lopputyo.data;

public class Course {
    protected String courseName;
    protected String courseTeacher;
    //protected int courseId;
    protected String courseLenght;


    public Course(String courseName, String courseTeacher, String courseLenght) {
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.courseLenght = courseLenght;
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

    /*public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }*/

    public String getCourseLenght() {
        return this.courseLenght;
    }

    public void setCourseLenght(String courseLenght) {
        this.courseLenght = courseLenght;
    }
}