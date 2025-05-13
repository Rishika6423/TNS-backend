package com.tnsif.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<Student>();
		l.add(new Student(101,"Kavya","DS",8.7f,21));
		l.add(new Student(102,"Sam","CS",6.7f,22));
		l.add(new Student(103,"Rishi","CSE",9.7f,18));
		l.add(new Student(104,"Rishika","IT",8.1f,18));
		Collections.sort(l);
		for(Student i:l) {
			System.out.println(i);
		}
	}
}