import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		float x1 , y1 , x2 , y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Point1 ");
		System.out.print("Enter X co-ordinate : ");
		x1 = sc.nextFloat();
		System.out.print("Enter Y co-ordinate : ");
		y1 = sc.nextFloat();
		System.out.println("Enter Point2 ");
		System.out.print("Enter X co-ordinate : ");
		x2 = sc.nextFloat();
		System.out.print("Enter Y co-ordinate : ");
		y2 = sc.nextFloat();
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
        p1.getDetails();
        p2.getDetails();
        if(p1.isEqual(p2)) {
        	System.out.println("Points are same.");
        }
        else {
        	System.out.println("Distance between points : "+p1.calculateDistance(p2));
        }
	}

}
