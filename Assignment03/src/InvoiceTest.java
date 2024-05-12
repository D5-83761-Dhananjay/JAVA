import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pn , pd ;
		int qty;
		double ppi ;
		Invoice ivc = new Invoice();
		System.out.print("Enter Part Number : ");
		pn = sc.nextLine();
		ivc.setPartNumber(pn);
		System.out.print("Enter Part Description : ");
		pd = sc.nextLine();
		ivc.setPartDescription(pd);
		System.out.print("Enter Quantity : ");
		qty = sc.nextInt();
		ivc.setQuantity(qty);
		System.out.print("Enter Price per Item : Rs.");
		ppi = sc.nextDouble();
		ivc.setPricePerItem(ppi);
		
		System.out.println("**********");
		System.out.println("Part Number : "+ivc.getPartNumber());
		System.out.println("Part Description : "+ivc.getPartDescription());
		System.out.println("Quantity : "+ivc.getQuantity());
		System.out.println("Price per item : Rs."+ivc.getPricePerItem());
		System.out.println("--------------------");
		System.out.println("Total Cost : Rs."+ivc.calcInvAmt());
		System.out.println("**********");
		
	}

}
