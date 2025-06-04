package com.example.sriindudemo.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
	
	private String name;
	
	@Autowired
	private Technology tech;
	public void print() {
		name="rishika";
		System.out.println("the student details is:"+name);
		tech.techid=101;
		tech.techname="TNS";
		tech.display();
	}
}