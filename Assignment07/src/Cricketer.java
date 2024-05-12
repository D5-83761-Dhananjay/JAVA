import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {
	int wicket;
	int runs ;
	public Cricketer() {
	}
	public Cricketer(int wicket, int runs) {
		super();
		this.wicket = wicket;
		this.runs = runs;
	}
	@Override
	public int getWickets() {
		return wicket;
	}
	@Override
	public int getRuns() {
		return runs;
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}
	@Override
	public int getMatchesPlayed() {
		// TODO Auto-generated method stub
		return super.getMatchesPlayed();
	}
	@Override
	public void setMatchesPlayed(int matchesPlayed) {
		// TODO Auto-generated method stub
		super.setMatchesPlayed(matchesPlayed);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Cricketer [ " +super.toString()+  "wicket=" + wicket + ", runs=" + runs + "]";
	}
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter Wickets : ");
		wicket = sc.nextInt();
		System.out.print("Enter Runs : ");
		runs = sc.nextInt();
	}

	

}
