package com.lopputyo.lopputyo.data;

// ClassRoomCourse inherits Course
public class ClassRoomCourse extends Course {
    // Unique variable to ClassRoomCourse
    private String classRoomId;

    // Constructros
    public ClassRoomCourse() {
        super();
    }

    public ClassRoomCourse(String classRoomId, String courseName, String courseTeacher, String courseLenght) {
        super(courseName, courseTeacher, courseLenght);
        this.classRoomId = classRoomId;
    }

    // Getters and setters
    // Set a ClassRoomCourse when the parameter is an object
    public void setClassRoomCourseInfo(ClassRoomCourse crc) {
        new ClassRoomCourse(crc.classRoomId, crc.courseName, crc.courseTeacher, crc.courseLenght);
    }

    public String getClassRoom() {
        return this.classRoomId;
    }

    public void setClassRoom(String classRoom) {
        this.classRoomId = classRoom;
    }

    public String getClassRoomId() {
        return this.classRoomId;
    }

    public void setClassRoomId(String classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getClassRoomCourseName() {
        return super.getCourseName();
    }
}