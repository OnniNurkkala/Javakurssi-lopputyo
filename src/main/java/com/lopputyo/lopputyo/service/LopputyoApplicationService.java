package com.lopputyo.lopputyo.service;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lopputyo.lopputyo.data.ClassRoomCourse;
import com.lopputyo.lopputyo.data.OnlineCourse;
import com.lopputyo.lopputyo.data.Student;

@Service
public class LopputyoApplicationService implements Serializable {

    //Connect Service to file Service
    @Autowired
    FileService fileService;

// Course
    // Get students of a specific course by course id
    public List<Student> getCourseStudents(String courseId){
        List<Student> courseStudents = new ArrayList<>();
        for (Student student : students) { 
            if (student.getStudentId().equals(courseId)) { //compare student id & course id
                courseStudents.add(student);
            }
        }
        return courseStudents;
    }

// OnlineCourse
    // Create a list of online courses
    public List<OnlineCourse> onlinecourses = new ArrayList<>();

    // Set a online course and add it to the list
    public void addOnlineCourse(OnlineCourse oc) {
        oc.setOnlineCourseInfo(oc);
        onlinecourses.add(oc);
    }
    
    // Return the list
    public List<OnlineCourse> getOnlineCourse() {
        return onlinecourses;
    }

    // Search and return a specific online course by course name
    public OnlineCourse getOnlineCourseByName(String courseName) {
        OnlineCourse oc = new OnlineCourse();
        for (OnlineCourse onlinecourse : onlinecourses) {
            if (onlinecourse.getOnlineCourseName().equals(courseName)) {
                oc = onlinecourse;
            }
        }
        return oc;
    }

// ClassRoomCourse
    // Functionality of the ClassRoomCourse is the same as the OnlineCourse
    public List<ClassRoomCourse> classRoomCourses = new ArrayList<>();

    public void addClassRoomCourse(ClassRoomCourse crc) {
        crc.setClassRoomCourseInfo(crc);
        classRoomCourses.add(crc);
    }

    public List<ClassRoomCourse> getClassRoomCourse() {
        return classRoomCourses;
    }

    public ClassRoomCourse getClassRoomCourseByName(String courseName) {
        ClassRoomCourse crc = new ClassRoomCourse();
        for (ClassRoomCourse classroomcourse : classRoomCourses) {
            if (classroomcourse.getClassRoomCourseName().equals(courseName)) {
                crc = classroomcourse;
            }
        }
        return crc;
    }

// Student
    // Create list of students
    public List<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student s) {
        s.setStudentInfo(s);
        students.add(s);
    }

    // Return a list of students
    public List<Student> getStudents() {
        return students;
    }

    // Get student by first- and last name from the list
    public Student getStudentByName(String fname, String lname) {
        Student s = new Student();
        for (Student student : students) {
            if ((student.getStudentFirstName().equals(fname)) && (student.getStudentLastName().equals(lname))) {
                s = student;
            }
        }
        return s;
    }

    // Add students to a specific text file in addStudentFileInfo
    public void addStudentFileInfo() throws IOException {
        fileService.addStudentFileInfo(students);
    }

    // Get students from a specific text file from getStudentFileInfo
    public List<Student> getStudentsFileInfo() throws IOException, ClassNotFoundException {
        students.clear();
        students.addAll(fileService.getStudentFileInfo());
        return fileService.getStudentFileInfo();
    }

}
