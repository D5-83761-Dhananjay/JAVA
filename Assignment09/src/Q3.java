import java.util.Scanner;
import java.util.StringTokenizer;

//write a java program to count number of words in the below given String
public class Q3 {
	public static int strCount(String str) {
		if(str==null  || str.isEmpty()) {
			return 0;
		}
		 StringTokenizer st = new StringTokenizer(str," ");
		 return st.countTokens();
		 
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("Count of number of words : "+strCount(str));
	}

}
