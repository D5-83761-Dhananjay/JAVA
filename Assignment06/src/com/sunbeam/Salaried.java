package com.sunbeam;

import java.util.Scanner;

public class Salaried extends Employee {
private double weeklySalary;
	
	public Salaried() {
		System.out.println("Salaried()");
	}

	public Salaried(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter Weekly Salary");
		weeklySalary =sc.nextDouble();
	}
	
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		double total =getWeeklySalary()*4;
		System.out.println("Total Salary : "+total);
		return total;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+super.toString()+",weeklySalary="+weeklySalary+"]";
	}
	

}
