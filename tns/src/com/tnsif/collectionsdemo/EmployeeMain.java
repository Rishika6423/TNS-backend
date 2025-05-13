package com.tnsif.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(101,"Allen",67890));
		l.add(new Employee(102,"Evan",56789));
		l.add(new Employee(103,"Bobby",90123));
		l.add(new Employee(104,"Candy",89012));
		
		System.out.println("sort by name");
		Collections.sort(l,new EmployeeNameCom());
		for(Employee e:l) {
			System.out.println(e.eid+","+e.ename+","+e.sal);
	    }
		
	    System.out.println("sort by salary");
	    Collections.sort(l,new EmployeeSalCom());
	    for(Employee e:l) {
		    System.out.println(e.eid+","+e.ename+","+e.sal);
        }
	}
}