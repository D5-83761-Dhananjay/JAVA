import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class tester {
	static int menu(Scanner sc) {
		int ch;
		System.out.println("********************");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits");
		System.out.println("5.Display details of all fruits in basket");
		System.out.println("6.Mark fruit as stale");
		System.out.println("7.Display taste of all stale fruits");
		System.out.println("8.Mark all sour fruits stale");
		System.out.println("0.Exit");
		System.out.print("Input Choice : ");
		ch = sc.nextInt();
		System.out.println("********************");
		return ch;
	}
	public static void main(String[] args) {
		int ch , index,counter=0,c=1 ,a=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input size of basket : ");
		index = sc.nextInt();
		Fruit[] basket = new Fruit[index]; 
		do {
			switch(ch=menu(sc)) {
			case 0 :
				System.out.println("Thank you ...");
				break;
			case 1 :
				if(counter<basket.length) {
				basket[counter++] = new Mango("Mango",175,"Yello");
				}else System.out.println("Basket is full.");
				break;
			case 2 :
				if(counter<basket.length) {
				basket[counter++] = new Orange("Orange","orange",232);
				}else System.out.println("Basket is full.");
				break;
			case 3 :
				if(counter<basket.length) {
				basket[counter++] = new Apple("Apple","Red",354);
				}else System.out.println("Basket is full.");
				break;
			case 4 :
				for(Fruit f : basket) {
					System.out.println(c+". "+f.getName());
					c++;
				}
				break;
			case 5:
				for(Fruit f : basket) {
					System.out.print(a+". "+f.toString());
					System.out.print(" Taste : "+f.taste()+" ");
					System.out.println(", Is Fresh : "+f.isFresh()+" ]");
					a++;
				}
				break;
			case 6:
				System.out.print("Enter index of fruit to make stale : ");
				index = sc.nextInt();
				if(index<basket.length) {
				basket[index].setFresh(false);
				}else System.out.println("No such fruit is there(invalid index).");
				break;
			case 7:
				for(Fruit f : basket) {
					if(f.isFresh()==false) {
						System.out.println(f.taste());
					}
				}
				break;
			case 8 :
				for(Fruit f : basket) {
					if(f.taste()=="sour") {
						f.setFresh(false);
					}
				}
				break;
			default :
				System.out.println("Wrong choice ...");
				break;
			}
		}while(ch!=0);
	}

}
