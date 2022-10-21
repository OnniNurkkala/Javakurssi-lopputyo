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

// OnlineCourse mappings
    @PostMapping("addOnlineCourse")
    public Course addOnlineCourse(
            @RequestParam String courseJoinId,
            @RequestParam String courseName,
            @RequestParam String courseTeacher,
            @RequestParam String courseLenght) {
        OnlineCourse oc = new OnlineCourse(courseJoinId, courseName, courseTeacher, courseLenght);
        myLopputyoApplicationService.addOnlineCourse(oc);
        return oc;
    }

    @GetMapping("getOnlineCourse")
    public List<OnlineCourse> getOnlineCourse() {
        return myLopputyoApplicationService.getOnlineCourse();
    }

    @GetMapping("getOnlineCourseByName")
    public OnlineCourse getOnlineCourseByName(
            @RequestParam String courseName) {
        return myLopputyoApplicationService.getOnlineCourseByName(courseName);
    }

// ClassRoomCourse mappings
    @PostMapping("addClassRoomCourse")
    public Course addClassRoomCourse(
            @RequestParam String classRoomId,
            @RequestParam String courseName,
            @RequestParam String courseTeacher,
            @RequestParam String courseLenght) {
        ClassRoomCourse crc = new ClassRoomCourse(classRoomId, courseName, courseTeacher, courseLenght);
        myLopputyoApplicationService.addClassRoomCourse(crc);
        return crc;
    }

    @GetMapping("getClassRoomCourse")
    public List<ClassRoomCourse> getClassRoomCourse() {
        return myLopputyoApplicationService.getClassRoomCourse();
    }

    @GetMapping("getClassRoomCourseByName")
    public ClassRoomCourse getClassRoomCourseByName(
            @RequestParam String courseName) {
        return myLopputyoApplicationService.getClassRoomCourseByName(courseName);
    }

// Student mappings
    @PostMapping("addStudent")
    public Student addStudent(
            @RequestParam String fname,
            @RequestParam String lname,
            @RequestParam Integer age) {

        Student s = new Student(fname, lname, age);
        myLopputyoApplicationService.addStudent(s);
        return s;
    }

    @GetMapping("getStudents")
    public List<Student> getStudents() {
        return myLopputyoApplicationService.getStudents();
    }

    @GetMapping("getStudentByName")
    public Student getStudentByName(
            @RequestParam String fname,
            @RequestParam String lname) {
        return myLopputyoApplicationService.getStudentByName(fname, lname);
    }

    @PostMapping("addStudentsFile")
    public void addStudentsFile() throws IOException {
        myLopputyoApplicationService.addStudentFileInfo();
    }

    @GetMapping("getStudentsFile")
    public List<Student> getStudentsFile() throws IOException, ClassNotFoundException {
        return myLopputyoApplicationService.getStudentsFileInfo();
    }

}
