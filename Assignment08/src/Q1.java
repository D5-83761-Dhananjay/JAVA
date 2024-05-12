import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			System.out.println("Enter a string : ");
			String userInput = sc.nextLine();
			if(userInput.length()>80) {
				throw new ExceptionLineTooLong("The string is too long .");
			}
			System.out.println("Length of the input string : "+userInput.length());
		}
		catch(ExceptionLineTooLong e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}
