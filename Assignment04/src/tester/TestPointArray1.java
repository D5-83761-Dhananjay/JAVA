package tester;

import java.util.Scanner;

public class TestPointArray1 {
    public static int menu() {
    	int menu ;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("**********");
    	System.out.println("1.Display details of a specific point ");
    	System.out.println("2.Display x, y co-ordinates of all points ");
    	System.out.println("3.Display distance between specified points ");
    	System.out.println("4.Exit ");
    	System.out.print("Enter the menu choice : ");
    	menu = sc.nextInt();
    	System.out.println("**********");
    	return menu;
    	
    }
	public static void main(String[] args) {
		int ch,index,i1,i2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of points to plot : ");
		Point2D[] points  = new Point2D[sc.nextInt()];
		for(int j=0;j<points.length;j++) {
			System.out.println((j+1)+".");
			Point2D p = new Point2D();
			System.out.print("Enter X co-ordinate : ");
			p.setX(sc.nextFloat());
			System.out.print("Enter Y co-ordinate : ");
			p.setY(sc.nextFloat());
			points[j] = p;
		}
		do {
			switch(ch=menu()){
				case 1:
					System.out.print("Enter the index : ");
					index = sc.nextInt();
					if(index<points.length) {
						System.out.println(points[index].getDetails());
					}
					else {
						System.out.println("  Invalid index , pls retry!!!! ");
					}
					break;
				case 2:
					System.out.println("----------------");
					for(Point2D pt : points) {
						System.out.println(pt.getDetails());
						System.out.println("----------------");
					}
					break;
				case 3:
					System.out.print("Enter the starting index : ");
					i1 = sc.nextInt();
					System.out.print("Enter the ending index : ");
					i2 = sc.nextInt();
					if((0<= i1)&& (i1< points.length)) {
					if((0<= i2)&& (i2< points.length)) {
					if(i1!=i2) {
						if(points[i1].isEqual(points[i2])) {
							System.out.println("Points are the same.");
						}
						else {
							System.out.println("The distance between points is : "+points[i1].calculateDistance(points[i2]));
							
						}
						}else System.out.println("You have choosen the same index both the times...");
					} else System.out.println("Invalid input...");
					}else System.out.println("Invalid input...");
					break;
				case 4: 
					System.out.println("  ---THANK YOU--- ");
					break;
				default :
					System.out.println("  Invalid input ");
					break;
			}
		}while(ch!=4);
	}

}
