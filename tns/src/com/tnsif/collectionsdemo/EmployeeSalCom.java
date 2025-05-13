package com.tnsif.collectionsdemo;

import java.util.Comparator;

public class EmployeeSalCom implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return Double.compare(e2.sal,e1.sal);	}

}
