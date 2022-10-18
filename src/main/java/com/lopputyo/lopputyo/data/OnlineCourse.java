package com.lopputyo.lopputyo.data;


public class OnlineCourse extends Course{
    private String courseJoinId;

    public OnlineCourse(String courseJoinId,String courseName, String courseTeacher, String courseLenght) {
        super(courseName, courseTeacher, courseLenght);
        this.courseJoinId = courseJoinId;
    }

    public void setOnlineCourseInfo(OnlineCourse oc){
        new OnlineCourse(oc.courseJoinId, oc.courseName, oc.courseTeacher, oc.courseLenght);
    }

    public String getCourseJoinId() {
        return this.courseJoinId;
    }

    public void setCourseJoinId(String courseJoinId) {
        this.courseJoinId = courseJoinId;
    }


}
