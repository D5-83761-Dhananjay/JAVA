package com.sunbeam;

import java.util.Scanner;

public class Test {
	
	static int menu(Scanner sc) {
		System.out.println("********************************");
		System.out.println("0.Exit");
		System.out.println("1.Salaried Empoloyee");
		System.out.println("2.Hourly Employee");
		System.out.println("3.Commission Employee");
		System.out.println("4.Base Salaried Employee");
		System.out.println("5.Display all Employees");
		System.out.print("Input choice : ");
		int menu = sc.nextInt();
		System.out.println("********************************");
		return menu;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch , count=0 , n ;
		System.out.print("Enter the number of Employee : ");
		n = sc.nextInt();
		Employee[] employee = new Employee[n];
		do {
			switch(ch=menu(sc)) {
			case 0:
				System.out.println("Thank you...");
				break;
			case 1:
				if(count<n)
				{
					employee [count]=new Salaried();
					employee[count].accept(sc);
					count++;
				}
				else
				{
					System.out.println("Index out of Bounds");
				}
				break;
			case 2:
				if(count<n)
				{
					employee [count]=new Hourly();
					employee[count].accept(sc);
					count++;
				}
				else
				{
					System.out.println("Index out of Bounds");
				}
				break;
			case 3:
				if(count<n)
				{
					employee [count]=new Commission();
					employee[count].accept(sc);
					count++;
				}
				else
				{
					System.out.println("Index out of Bounds");
				}
				break;
			case 4:
				if(count<n)
				{
					employee [count]=new Base_Salaried_Commmision();
					employee[count].accept(sc);
					
					count++;
				}
				else
				{
					System.out.println("Index out of Bounds");
				}
				break;
			case 5:
				for(Employee people:employee)
				{
					System.out.println(people.toString());
					people.calculateSalary();
				}
				break;
			default:
				System.out.println("Wrong Input choice ");
			    break;
			}

			
		}while(ch!=0);
	}

}
