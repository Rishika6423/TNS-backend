package com.example.sriindudemo.ioc;

import org.springframework.stereotype.Component;

@Component
public class Technology {
	public int techid;
	public String techname;
	
	public void display() {
		System.out.println("the tech details are :"+techid+" , "+techname);
	}
}
