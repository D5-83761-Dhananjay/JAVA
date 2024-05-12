import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		double d1 ;
		double d2 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		if(sc.hasNextDouble()){
			
			d1 = sc.nextDouble();
			
			d2 = sc.nextDouble();
			double avg = (d1+d2)/2;
			System.out.print("Average is  : "+avg);
		}
		else {
			System.out.print("ERROR ! Only double values are acceptible... ");
		}
			
	}
}
		