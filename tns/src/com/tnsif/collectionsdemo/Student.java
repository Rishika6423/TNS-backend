package com.tnsif.collectionsdemo;

public class Student implements Comparable<Student>{
	public int sid;
	public String sname;
	public String branch;
	public float cgpa;
	public int age;
	public Student(int sid, String sname, String branch, float cgpa, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
		this.cgpa = cgpa;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", branch=" + branch + ", cgpa=" + cgpa + ", age=" + age +"]";
	}
	@Override
	public int compareTo(Student s) {
		if(age==s.age)
			return 0;
		else if(age>s.age)
			return 1;
		else
			return -1;
	}
}