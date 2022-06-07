package com.example.marks_spring.controller;

import com.example.marks_spring.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentController {



    private  Studentservice studentservice;


    @GetMapping("/index")
    public  String viewMarks(Model model){
        model.addAttribute("listStudents",studentservice.getAllStudents());
        return "index";
    }
}

