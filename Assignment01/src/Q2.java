import java.util.Scanner;

public class Q2 {
	public static int menuList() {
		int choice;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**************");
		System.out.println(" Menu ");
		System.out.println("1.Dosa ");
		System.out.println("2.Samosa ");
		System.out.println("3.Idli Sambar ");
		System.out.println("4.Medu Vada Sambar ");
		System.out.println("5.Pav Bhaji ");
		System.out.println("6.Kachori ");
		System.out.println("7.Poha ");
		System.out.println("8.Upma ");
		System.out.println("9.Vada Pav ");
		System.out.println("10.Generate Bill ");
		System.out.println("0.Cancle Order ");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		System.out.println("**************");
		return choice ;
	}
	public static void main(String[] args) {
		int quantity=0 , menu ;
		int totalBill =0 ;
		Scanner sc = new Scanner(System.in);
		do {
			switch(menu=menuList()) {
			case 0 :
				System.out.println(" Order Canceled ");
				totalBill =0;
				quantity = 0;
				return;
			case 1:
				System.out.print("Enter Quentity :");
				int qty1 = sc.nextInt();
				quantity += qty1;
				totalBill = qty1*40+totalBill ;
				break;
			case 2:
				System.out.print("Enter Quentity :");
				int qty2 = sc.nextInt();
				quantity += qty2;
				totalBill = qty2*15+totalBill;
				break;	
			case 3:
				System.out.print("Enter Quentity :");
				int qty3 = sc.nextInt();
				quantity += qty3;
				totalBill = qty3*30+totalBill;
				break;
			case 4:
				System.out.print("Enter Quentity :");
				int qty4 = sc.nextInt();
				quantity += qty4;
				totalBill = qty4*30+totalBill;
				break;	
			case 5:
				System.out.print("Enter Quentity :");
				int qty5 = sc.nextInt();
				quantity += qty5;
				totalBill = qty5*50+totalBill;
				break;
			case 6:
				System.out.print("Enter Quentity :");
				int qty6 = sc.nextInt();
				quantity += qty6;
				totalBill = qty6*15+totalBill;
				break;
			case 7:
				System.out.print("Enter Quentity :");
				int qty7 = sc.nextInt();
				quantity += qty7;
				totalBill = qty7*20+totalBill;
				break;
			case 8:
				System.out.print("Enter Quentity :");
				int qty8 = sc.nextInt();
				quantity += qty8;
				totalBill = qty8*20+totalBill;
				break;
			case 9:
				System.out.print("Enter Quentity :");
				int qty9 = sc.nextInt();
				quantity += qty9;
				totalBill = qty9*20+totalBill;
				break;
			case 10:
				System.out.println("********");
				System.out.println("Total Quantity Purchesed : "+quantity);
				System.out.println("Total Bill Amount : RS."+totalBill);
				System.out.println("----Thank You----");
				System.out.println("********");
				break;
			default :
				System.out.println("Invalid Choice ....");
				break;
			}
		}while( menu !=10 );
	}
}
