
package com.tnsif.PredefinedAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
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
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", branch=" + branch + ", cgpa=" + cgpa + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Student s) {
        if (age == s.age)
            return 0;
        else if (age > s.age)
            return 1;
        else
            return -1;
    }
    public static void main(String[] args) {
        List<Student> l = new ArrayList<Student>();
        l.add(new Student(101, "Kavya", "DS", 8.7f, 21));
        l.add(new Student(102, "Sam", "CS", 6.7f, 22));
        l.add(new Student(103, "Rishi", "CSE", 9.7f, 18));
        l.add(new Student(104, "Rishika", "IT", 8.1f, 18));
        Collections.sort(l);
        for (Student i : l) {
            System.out.println(i);
        }
    }
}