package com.sunbeam;

import java.util.Scanner;

public abstract class Employee {
private String firstName ;
private String lastName ;
private int SSN;
public Employee() {
	
}
public Employee(String firstName, String lastName, int sSN) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	SSN = sSN;
}
public void accept(Scanner sc) {
	System.out.print("Enter First Name : ");
	firstName = sc.next();
	System.out.print("Enter Last Name : ");
	lastName = sc.next();
	System.out.print("Enter SSN : ");
	SSN = sc.nextInt();
}
public abstract double calculateSalary();
@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getSSN() {
	return SSN;
}
public void setSSN(int sSN) {
	SSN = sSN;
}

}
