package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.sprinframework.beans.factory.annotation.Autowired; 
import 
@Service
public class StudentServiceImpl implememts StudentService{
    @Autowired
    StudentRepository stdrepo;
    @Override 
    public class postStudent(Student st){
           return stdrepo.save(st); 
    }
}