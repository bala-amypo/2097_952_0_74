package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.antity.Student;

@RestController
public class StudentController{
     @PostMapping("/addStudent")
     public Student addStudent(@RequestBody Student st){
        return 
     }
}