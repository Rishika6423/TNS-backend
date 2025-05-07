package com.tnsif.InterfaceDemo;

public interface Bank {
	double DEPOSIT_LIMIT=25000;
	//abstract methods
	void withdraw(double amount);
	void deposit(double amount);
}
