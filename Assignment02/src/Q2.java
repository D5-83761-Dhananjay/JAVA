import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		float miles , costPerGallon ,  avgMiles , parkingFees , tollsPerDay , total;
		Scanner sc = new Scanner(System.in);
		System.out.print("A.Total miles driven per day : ");
		miles = sc.nextFloat();
		System.out.print("B.Cost per gallon of gasoline : Rs.");
		costPerGallon = sc.nextFloat();
		System.out.print("C.Average miles per gallon : ");
		avgMiles = sc.nextFloat();
		System.out.print("D.Parking fees per day : Rs.");
		parkingFees = sc.nextFloat();
		System.out.print("E.Tolls per day : Rs.");
		tollsPerDay= sc.nextFloat();
		
		total = tollsPerDay + parkingFees + (miles/avgMiles)*costPerGallon;
		
		System.out.println("-----");
		System.out.println("Your Cost per Day to driving to work is Rs."+total);
		System.out.println("*****");
	}

}
