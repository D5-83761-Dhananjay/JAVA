import java.util.Scanner;

//Write a java code to check string is palindrome. 
public class Q2 {
	public static void main(String[] args) {
		String org,rev="" ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		org = sc.next();	
		for(int a=(org.length()-1);a>=0;a--) {
			rev = rev + org.charAt(a);
		}
		if(org.equals(rev)) {
			System.out.print("String is Palindrome.");
		}
		else {
			System.out.print("String is not a Palindrome.");
		}
	}
}
