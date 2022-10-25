package com.lopputyo.lopputyo.data;

import java.io.Serializable;

// OnlineCourse inherits course
public class OnlineCourse extends Course implements Serializable {
    // Unique variable to OnlineCourse
    private String courseJoinId;

// Constructors
    public OnlineCourse() {
        super();
    }

    public OnlineCourse(String courseJoinId, String courseName, String courseTeacher, String courseLenght,
            String courseId) {
        super(courseName, courseTeacher, courseLenght, courseId);
        this.courseJoinId = courseJoinId;
    }

// Getters and setters
    // Set a OnlineCourse when the parameter is an object
    public void setOnlineCourseInfo(OnlineCourse oc) {
        new OnlineCourse(oc.courseJoinId, oc.courseName, oc.courseTeacher, oc.courseLenght, oc.courseId);
    }

    public String getCourseJoinId() {
        return this.courseJoinId;
    }

    public void setCourseJoinId(String courseJoinId) {
        this.courseJoinId = courseJoinId;
    }

    public String getOnlineCourseName() {
        return super.getCourseName();
    }

}
