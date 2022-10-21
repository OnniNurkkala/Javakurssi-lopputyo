package com.lopputyo.lopputyo.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lopputyo.lopputyo.data.Student;

@Service
public class FileService implements Serializable {

// Student
    // Creates the required output streams and writes a list to a text file as an object
    public void addStudentFileInfo(List<Student> students) throws IOException {
        FileOutputStream fos = new FileOutputStream("./src/documents/students.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.close();
    }

    /* Creates the required input streams and creates a list to return which
       is filled with objects from a text file*/
    public List<Student> getStudentFileInfo() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("./src/documents/students.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Student> Filestudents = (List<Student>) ois.readObject();
        ois.close();
        return Filestudents;
    }
}
