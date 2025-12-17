package com.example.demo.service;

import com.example.demo.entity.Student;
import java.util.List;


public interface StudentService {
    Student postStudent(Student st);
    List<Student> getAllStudents();
}
