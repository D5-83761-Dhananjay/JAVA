package com.sunbeam;

import java.util.Scanner;

public class Base_Salaried_Commmision extends Commission {
	private double base_salary;
	
	public Base_Salaried_Commmision() {
		System.out.println("Base_Salaried_commision");
	}

	public Base_Salaried_Commmision(double base_salary) {
		super();
		this.base_salary = base_salary;
	}

	public double getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.print("Enter Base salary : ");
		base_salary =sc.nextDouble();
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		double total =super.calculateSalary()+(1.1*base_salary);
		System.out.println("Total Salary : "+total);
		return total;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+super.toString()+",base_salary="+base_salary+"]";
	}
	

}
