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
public class FileService implements Serializable{

    public void addStudentFileInfo(List<Student> students) throws IOException {
        FileOutputStream fos = new FileOutputStream("./src/documents/students.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.close();
    }
    

    public List<Student> getStudentFileInfo() throws IOException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream("./src/documents/students.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Student> Filestudents = (List<Student>)ois.readObject();
        ois.close();
        return Filestudents;
    }

}
