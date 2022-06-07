package com.example.marks_spring.service;

import com.example.marks_spring.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Studentservice {
    List<Student> getAllStudents();


}
