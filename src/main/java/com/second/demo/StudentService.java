package com.second.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudentService(Student student) {
        studentRepository.addStudentToDb(student);
    }
    public Student getStudentByNameService(String name){
        Student student = studentRepository.getStudentFromDb(name);
        return student;
    }
}
