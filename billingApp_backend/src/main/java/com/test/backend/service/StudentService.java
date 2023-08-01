package com.test.backend.service;

import com.test.backend.dto.Student;
import com.test.backend.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        studentRepo.findAll().forEach(student -> students.add(student));
        return students;
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }
}
