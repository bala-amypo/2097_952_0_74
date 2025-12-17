package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private Long id;          // Primary Key

    private String name;
    private String dept;
    private LocalDate dob;    // Date of Birth
    private double cgpa;

    public Student() {
    }

    public Student(Long id, String name, String dept, LocalDate dob, double cgpa) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.dob = dob;
        this.cgpa = cgpa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
