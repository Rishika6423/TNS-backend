package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Student1;
import com.example.project.service.StudentService;

@RestController
public class Controller {
	@Autowired
    private StudentService sser;

    // Add student
    @PostMapping("/addstudent")
    public Student1 addStudent(@RequestBody Student1 st) {
        return sser.addStudent(st);
    }

    // Get all students
    @GetMapping("/getstudents")
    public List<Student1> getAllStudents() {
        return sser.getAllStudents();
    }

    // Update student
    @PutMapping("/updatestudent")
    public Student1 updateStudent(@RequestBody Student1 st) {
        return sser.updateStudent(st);
    }

    // Delete student
    @DeleteMapping("/deletestudent/{id}")
    public void deleteStudent(@PathVariable Long id) {
        sser.deleteStudent(id);
    }
}