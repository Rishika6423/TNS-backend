package com.tnsif.Generics;

public class GenericMethodMain {

	public static void main(String[] args) {
		Integer[] intarray= {1,2,3};
		String[] stringarray= {"Allen","Dolly","Candy"};
		
		//call the method
		GenericMethodDemo.displayArray(intarray);
		GenericMethodDemo.displayArray(stringarray);
	}

}
