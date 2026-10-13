package com.example.studentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentservice.entity.Student;
import com.example.studentservice.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Student save(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudent(Integer id) {
        return repository.findById(id).orElse(null);
    }
}