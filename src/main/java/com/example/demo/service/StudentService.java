package com.example.demo.service;

import java.util.*;
import com.example.demo.entity.Student;


public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);
    String updateData(Long id,Student st);
}
