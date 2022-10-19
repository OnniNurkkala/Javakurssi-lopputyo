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
public class LopputyoApplicationRestController implements Serializable{

    @Autowired
    LopputyoApplicationService myLopputyoApplicationService;

    //OnlineCourse
    @PostMapping("addOnlineCourse")
    public Course addOnlineCourse(
        @RequestParam String courseJoinId,
        @RequestParam String courseName,
        @RequestParam String courseTeacher,
        @RequestParam String courseLenght){
        
        OnlineCourse oc = new OnlineCourse(courseJoinId,courseName, courseTeacher, courseLenght);

        myLopputyoApplicationService.addOnlineCourse(oc);
        return oc;
    }
    
    //ClassRoomCourse
    @PostMapping("addClassRoomCourse")
    public Course addClassRoomCourse(
        @RequestParam String classRoomId,
        @RequestParam String courseName,
        @RequestParam String courseTeacher,
        @RequestParam String courseLenght){
        
        ClassRoomCourse crc = new ClassRoomCourse(classRoomId,courseName,courseTeacher,courseLenght);

        myLopputyoApplicationService.addClassRoomCourse(crc);
        return crc;
    }

    //STUDENT
    //Student post&get
    @PostMapping("addStudent")
    public Student addStudent(
        @RequestParam String fname,
        @RequestParam String lname,
        @RequestParam Integer age){
        
        Student s = new Student(fname, lname, age);
        myLopputyoApplicationService.addStudent(s);
        return s;
    }
    @GetMapping("getStudents")
    public List<Student> getStudents(){
        return myLopputyoApplicationService.getStudents();
    }

    //Student file post&get
    @PostMapping("addStudentsFile")
    public void addStudentsFile() throws IOException {
        myLopputyoApplicationService.addStudentFileInfo();
    }
    
    @GetMapping("getStudentsFile")
    public List<Student> getStudentsFile() throws IOException,ClassNotFoundException {
        return myLopputyoApplicationService.getStudentsFileInfo();
    }
    
}
