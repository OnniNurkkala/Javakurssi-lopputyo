package com.lopputyo.lopputyo.service;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lopputyo.lopputyo.data.ClassRoomCourse;
import com.lopputyo.lopputyo.data.OnlineCourse;
import com.lopputyo.lopputyo.data.Student;

@Service
public class LopputyoApplicationService {

    @Autowired
    FileService fileService;

    public List <Student> students = new ArrayList<>();

    public void addOnlineCourse(OnlineCourse oc){
        oc.setOnlineCourseInfo(oc);
    }

    public void addClassRoomCourse(ClassRoomCourse crc){
        crc.setClassRoomCourseInfo(crc);
    }
    


    public void addStudent(Student s){
        s.setStudentInfo(s);
        students.add(s);
    }

    public List<Student> getStudents(){
        return students;
    }

    public List<Student> getStudentsFileInfo() throws IOException,ClassNotFoundException {
        return fileService.getStudentFileInfo();
    }

    public void addStudentFileInfo() throws IOException {
        FileService fs = new FileService();
        fs.addStudentFileInfo(students);
    }

 

}
