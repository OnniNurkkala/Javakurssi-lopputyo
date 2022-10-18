package com.lopputyo.lopputyo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lopputyo.lopputyo.data.ClassRoomCourse;
import com.lopputyo.lopputyo.data.OnlineCourse;
import com.lopputyo.lopputyo.data.Student;

@Service
public class LopputyoApplicationService {


    public void addOnlineCourse(OnlineCourse oc){
        oc.setOnlineCourseInfo(oc);
    }

    public void addClassRoomCourse(ClassRoomCourse crc){
        crc.setClassRoomCourseInfo(crc);
    }
    
    public void addStudent(Student s){
        s.setStudentInfo(s);
    }

    public List<Student> getStudents(){
        Student gs = new Student();
        return gs.getStudents();
        //return new ArrayList<>(students);
    }

}
