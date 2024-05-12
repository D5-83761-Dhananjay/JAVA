import java.util.Scanner;

//Write a java program to reverse a String

public class Q1 {

	public static void main(String[] args) {
		String org , rev="" ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		org = sc.next();
		for(int i = (org.length()-1);i>=0;i--) {
			rev = rev + org.charAt(i);
		}
		System.out.println("Reversed string : "+rev);
	}

}
