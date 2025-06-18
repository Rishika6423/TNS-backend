package com.example.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student1")
public class Student1 {
	    @Id
	    public long id;
	    public String name;
	    public String college;
	    public long roll;
	    public String qualification;
	    public String course;
	    public int year;
	    public String certificate;
	    public long hallTicketNo;
	    
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCollege() {
			return college;
		}
		public void setCollege(String college) {
			this.college = college;
		}
		public long getRoll() {
			return roll;
		}
		public void setRoll(long roll) {
			this.roll = roll;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getCertificate() {
			return certificate;
		}
		public void setCertificate(String certificate) {
			this.certificate = certificate;
		}
		public long getHallTicketNo() {
			return hallTicketNo;
		}
		public void setHallTicketNo(long hallTicketNo) {
			this.hallTicketNo = hallTicketNo;
		}
}