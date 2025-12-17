package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.sprinframework.beans.factory.annotation.Autowired; 
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository stdrepo;
    @Override
public Student saveStudent(Student st) {
    return stdrepo.save(st);
}

}