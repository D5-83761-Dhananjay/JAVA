import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double diameter;
		try {
		System.out.print("Enter Diameter : ");
		diameter = sc.nextDouble();
		Circle c = new Circle();
		c.setDiameter(diameter);
		System.out.println("Diameter : "+c.getDiameter());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
