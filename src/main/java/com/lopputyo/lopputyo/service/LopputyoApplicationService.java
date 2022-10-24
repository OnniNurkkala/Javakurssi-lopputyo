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


    //public List<Student> TEMPcourseStudents = new ArrayList<>();
    
    public List<Student> getOnlineCourseStudents(String courseId){
        List<Student> TEMPcourseStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getStudentId().equals(courseId)) {
                TEMPcourseStudents.add(student);
            }
        }
        List<Student> courseStudents = new ArrayList<Student>(TEMPcourseStudents);

        TEMPcourseStudents.clear();

        return courseStudents;
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
    public List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        s.setStudentInfo(s);
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    // Get student by first and lastname from the list
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
        return fileService.getStudentFileInfo();
    }

}
