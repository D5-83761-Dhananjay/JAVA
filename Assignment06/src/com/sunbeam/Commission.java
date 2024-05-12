package com.sunbeam;

import java.util.Scanner;

public class Commission extends Employee{
	private int grossSales;
	private double commissionRate;
	
	public Commission() {
		System.out.println("Commission();");
		
		
	}

	public Commission(int grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.print("Enter Gross Sales : ");
		grossSales =sc.nextInt();
		System.out.print("Enter commision rate : ");
		commissionRate =sc.nextDouble();
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		double total  =commissionRate*grossSales;
		System.out.println("Total Salary : "+total);
		return total;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+super.toString()+",CommisionRate="+commissionRate+",grossSales="+grossSales+"]";
	}

}
