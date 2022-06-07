package com.example.marks_spring.service;

import com.example.marks_spring.model.Student;
import com.example.marks_spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Studentserviceimpl implements Studentservice {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
