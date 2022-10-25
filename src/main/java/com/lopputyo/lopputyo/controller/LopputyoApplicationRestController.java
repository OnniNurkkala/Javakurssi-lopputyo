package com.lopputyo.lopputyo.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lopputyo.lopputyo.data.Student;
import com.lopputyo.lopputyo.data.Course;
import com.lopputyo.lopputyo.data.ClassRoomCourse;
import com.lopputyo.lopputyo.data.OnlineCourse;
import com.lopputyo.lopputyo.service.LopputyoApplicationService;

@RestController
public class LopputyoApplicationRestController implements Serializable {

    // Connect Controller to Service
    @Autowired
    LopputyoApplicationService myLopputyoApplicationService;

// Course mappings
    // Get students of a specific course by course id
    @GetMapping("getcoursestudents")
    public List<Student> getCourseStudents(
            @RequestParam String courseId) {
        return myLopputyoApplicationService.getCourseStudents(courseId);
    }

// OnlineCourse mappings
    @PostMapping("addonlinecourse")
    public Course addOnlineCourse(
            @RequestParam String courseJoinId,
            @RequestParam String courseName,
            @RequestParam String courseTeacher,
            @RequestParam String courseLenght,
            @RequestParam String courseId) {
        OnlineCourse oc = new OnlineCourse(courseJoinId, courseName, courseTeacher, courseLenght, courseId);
        myLopputyoApplicationService.addOnlineCourse(oc);
        return oc;
    }

    @GetMapping("getonlinecourse")
    public List<OnlineCourse> getOnlineCourse() {
        return myLopputyoApplicationService.getOnlineCourse();
    }

    @GetMapping("getonlinecoursebyname")
    public OnlineCourse getOnlineCourseByName(
            @RequestParam String courseName) {
        return myLopputyoApplicationService.getOnlineCourseByName(courseName);
    }

// ClassRoomCourse mappings
    @PostMapping("addclassroomcourse")
    public Course addClassRoomCourse(
            @RequestParam String classRoomId,
            @RequestParam String courseName,
            @RequestParam String courseTeacher,
            @RequestParam String courseLenght,
            @RequestParam String courseId) {
        ClassRoomCourse crc = new ClassRoomCourse(classRoomId, courseName, courseTeacher, courseLenght, courseId);
        myLopputyoApplicationService.addClassRoomCourse(crc);
        return crc;
    }

    @GetMapping("getclassroomcourse")
    public List<ClassRoomCourse> getClassRoomCourse() {
        return myLopputyoApplicationService.getClassRoomCourse();
    }

    @GetMapping("getclassroomcoursebyname")
    public ClassRoomCourse getClassRoomCourseByName(
            @RequestParam String courseName) {
        return myLopputyoApplicationService.getClassRoomCourseByName(courseName);
    }

// Student mappings
    @PostMapping("addstudent")
    public Student addStudent(
            @RequestParam String fname,
            @RequestParam String lname,
            @RequestParam Integer age,
            @RequestParam String studentId) {
        Student s = new Student(fname, lname, age, studentId);
        myLopputyoApplicationService.addStudent(s);
        return s;
    }

    @GetMapping("getstudents")
    public List<Student> getStudents() {
        return myLopputyoApplicationService.getStudents();
    }

    @GetMapping("getstudentbyname")
    public Student getStudentByName(
            @RequestParam String fname,
            @RequestParam String lname) {
        return myLopputyoApplicationService.getStudentByName(fname, lname);
    }

    @PostMapping("addstudentsfile")
    public void addStudentsFile() throws IOException {
        myLopputyoApplicationService.addStudentFileInfo();
    }

    @GetMapping("getstudentsfile")
    public List<Student> getStudentsFile() throws IOException, ClassNotFoundException {
        return myLopputyoApplicationService.getStudentsFileInfo();
    }

}
