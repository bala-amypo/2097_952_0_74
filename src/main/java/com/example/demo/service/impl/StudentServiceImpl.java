package com.example.demo.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
    @Override
    public String updateData(Long id,Student st){
        boolean status=studentRepository.existById(id);
        if(status){
            st.setId(id);
            studentRepository.save(st);
            return"Student updated Successfully";
        }
        else{
            return "Student with Id "+id+" not found";
        }
    }
    @Override
    public String deleteData(Long id){
        boolean status=studentRepository.existById(id);
        if(status){
            studentRepository.deleteById(id);
            return "Student Deleted Successfully";
        }
        else{
            return "Student not found with ID """
        }
    }
}
