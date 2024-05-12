import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int accNo , penBal , totCreApp , totCreChr , allLim , newBal ;
		System.out.println("Enter Details : ");
		System.out.print("1. Account number  : ");
		accNo = sc.nextInt();
		System.out.print("2. Allowed credit limit : ");
		allLim = sc.nextInt();
		System.out.print("3. Total of all items charged by the customer this month  : ");
		totCreApp = sc.nextInt();
		System.out.print("4. Total of all credits applied to the customer’s account this month  : ");
		totCreChr = sc.nextInt();
		System.out.print("5. Pending balance at the beginning of the month  : ");
		penBal = sc.nextInt();
		
		newBal = penBal + totCreApp - totCreChr ;
		System.out.println("*****");
		System.out.println("New Balance is : Rs."+newBal);
		if(newBal > allLim) {
			System.out.println("Credit limit exceeded....");
		}
		System.out.println("*****");
	} 

}
