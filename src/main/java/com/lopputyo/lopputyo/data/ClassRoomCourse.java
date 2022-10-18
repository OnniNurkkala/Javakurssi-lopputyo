package com.lopputyo.lopputyo.data;


public class ClassRoomCourse extends Course{
    private String classRoomId;

    public ClassRoomCourse(String classRoomId, String courseName, String courseTeacher, String courseLenght) {
        super(courseName, courseTeacher, courseLenght);
        this.classRoomId = classRoomId;
    }
    public void setClassRoomCourseInfo(ClassRoomCourse crc){
        new ClassRoomCourse(crc.classRoomId, crc.courseName, crc.courseTeacher, crc.courseLenght);
    }

    public String getClassRoom() {
        return this.classRoomId;
    }

    public void setClassRoom(String classRoom) {
        this.classRoomId = classRoom;
    }
}