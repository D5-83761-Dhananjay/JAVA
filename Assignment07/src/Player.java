import java.util.Objects;
import java.util.Scanner;

public abstract class Player  {
	private int id ;
	private String name;
	private int age;
	private int matchesPlayed;
	public Player(){
	}
	public Player(int id, String name, int age, int matchesPlayed, int wickets, int runs) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return age == other.age && id == other.id && matchesPlayed == other.matchesPlayed
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Player [ ID : " + id + ", Name : " + name + ", Age : " + age + ", Matches Played : " + matchesPlayed +  " ]";
	}
	public void accept(Scanner sc) {
		System.out.print("Enter Id : ");
		id = sc.nextInt();
		System.out.print("Enter Name : ");
		name = sc.next();
		System.out.print("Enter Age : ");
		age = sc.nextInt();
		System.out.print("Enter Matches played : ");
		matchesPlayed = sc.nextInt();
	}
	
}
