import java.util.Scanner;

public class Main {
	public static int menu(Scanner sc)
	{
		System.out.println("0. EXIT");
		System.out.println("1. Insert Player Details : ");
		System.out.println("2. Show total Runs :  ");
		System.out.println("3. Show total Wickets : ");
		System.out.println("4. Show total MatchesPlayed : ");
		System.out.println("5. Show details of all players : ");
		System.out.println("Enter your choice : ");
		return sc.nextInt();
	}


	public static void main(String[] args) {
		Player [] players= new Player[11];
		Scanner sc = new Scanner(System.in);
		int choice;
		while ((choice = menu(sc))!=0)
		{
			switch (choice) {
			case 1:
				for (int i = 0 ; i<11 ; i++)
				{
					players[i] = new Cricketer();
					players[i].accept(sc);
					System.out.println("--------------------------");
				}
				break;
			case 2:
                  int total_runs = 0;
                  Cricketer c;
                  for(int i = 0 ; i<11 ; i++)
                  {
                	  c = (Cricketer) players[i];
                	 total_runs = total_runs + c.getRuns();
                  }
                  System.out.println("Total runs = " + total_runs);
				break;
			case 3:
				int total_wickets = 0;
				Cricketer c1;
				for(int i = 0 ; i<11 ; i++)
				{
					c1 = (Cricketer) players[i];
					total_wickets = total_wickets + c1.getWickets();
				}
				 System.out.println("Total wickets = " + total_wickets);
				break;
			case 4:
				int total_matches = 0;
				Cricketer c2;
				for(int i = 0 ; i<11 ; i++)
				{
					c2 = (Cricketer) players[i];
					total_matches = total_matches + c2.getMatchesPlayed();
				}
				 System.out.println("Total matches = " + total_matches);
				break;
			case 5:
				Cricketer c3;
				for(int i = 0 ; i<11 ; i++)
				{
					c3 = (Cricketer) players[i];
					System.out.println(c3.toString());
					System.out.println("----------------------");
				}
				break;

			default:
				System.out.println("Please Enter Valid Input : ");
				break;
			}
			
		}
	System.out.println("Thank You!!");
	}

}
