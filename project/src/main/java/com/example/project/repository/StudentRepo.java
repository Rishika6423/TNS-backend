package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.entity.Student1;

public interface StudentRepo extends JpaRepository<Student1,Long> {

}