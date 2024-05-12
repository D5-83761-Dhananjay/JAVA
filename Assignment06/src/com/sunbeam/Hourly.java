package com.sunbeam;

import java.util.Scanner;

public class Hourly extends Employee {
	private double wage ;
	private int hrs ;
	
	public Hourly () {}

	public Hourly(double wage, int hrs) {
		super();
		this.wage = wage;
		this.hrs = hrs;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	@Override 
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter Wage : ");
		wage =sc.nextDouble();
		System.out.print("Enter Hours : ");
		hrs =sc.nextInt();
	}
	@Override 
	public double calculateSalary() {
		double total ;
		if(hrs <= 40) {
			total = getWage()*getHrs();
			System.out.println("Total Salary : "+total);
			return total;
		}
		else {
			total = (getWage()*(getHrs()-40)*1.5)+(getWage()*40);
			return total;
		}
	}

	@Override
	public String toString() {
		return "Hourly [ "+ super.toString() + "wage=" + wage + ", hrs=" + hrs +  "]";
	}	
}
