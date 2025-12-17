package com.example.demo.entity


import java.time.LocalDate;
@Entity
public class Student{
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private float cgpa;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.name=name;
    }
    public String getdept(){
        return dept;
    }
    public void setdept(String dept){
        this.dept=dept;
    }
    public LocalDate getdob(){
        return dob;
    }
    public void setdob(LocalDate dob){
        this.dob=dob;
    }
    public float getcgpa(){
        return cgpa;
    }
    public void setcgpa(float cgpa){
        this.cgpa=cgpa
    }
    public Student(){

    }
    public Student(Long id,String name,String dept,LocalDate dob,float cgpa){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.dob=dob;
        this.cgpa=cgpa;
    }
}