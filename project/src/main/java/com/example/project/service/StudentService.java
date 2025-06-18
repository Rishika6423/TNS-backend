package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Student1;
import com.example.project.repository.StudentRepo;

@Service
public class StudentService {
	 @Autowired
	    private StudentRepo srepo;

	    // Insert the Student data
	    public Student1 addStudent(Student1 st) {
	        return srepo.save(st);
	    }

	    // Get all the Student data
	    public List<Student1> getAllStudents() {
	        return srepo.findAll();
	    }

	    // Update the Student data
	    public Student1 updateStudent(Student1 st) {
	        Long id = st.getId();
	        Student1 s1 = srepo.findById(id).get();
	        s1.setName(st.getName());
	        s1.setCollege(st.getCollege());
	        s1.setRoll(st.getRoll());
	        s1.setQualification(st.getQualification());
	        s1.setCourse(st.getCourse());
	        s1.setYear(st.getYear());
	        s1.setCertificate(st.getCertificate());
	        s1.setHallTicketNo(st.getHallTicketNo());
	        return srepo.save(s1);
	    }

	    // Delete the Student data
	    public void deleteStudent(long id) {
	        srepo.deleteById(id);
	    }
}