package com.example.demo.service;

import com.example.demo.entity.Student;
import java.util.List;
import com.example.demo.model.Student;

public interface StudentService {
    Student postStudent(Student st);
    List<Student> getAllStudents();
}
