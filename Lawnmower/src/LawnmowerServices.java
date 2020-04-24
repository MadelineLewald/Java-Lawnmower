import java.util.Scanner;

public class LawnmowerServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		first();
		second();
		fourth();
		
		

	}
	
	public static class Global {
		static int money = 0;
	}
	

	public static void first() {	
		
		for(int x = 0; x < 5; x++) {
			System.out.println("would you like to  cut the grass?");
			Scanner scanner = new Scanner(System.in); //System.in means its coming from the console
			String answer = scanner.nextLine();
			if(answer.equals("yes")) {
				Global.money++;
				System.out.println("You have $" + Global.money + " and are using teeth to cut the grass");
			}
			else if(answer.contentEquals("no")) {
				System.out.println("You still have $" + Global.money);
			}
		}
		
	}
	
	public static void second() {
			
		if(Global.money == 5) {
			System.out.println("Would you like to buy a pair of rusty scissors?");
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if(answer.equals("yes")) {
				Global.money-=5;
				System.out.println("You have $" + Global.money);
				third();
			}
		}
			
	}
	
	public static void third() {	
			
		for(int x = 5; x < 26; x+=5) {
			System.out.println("would you like to  cut the grass?");
			Scanner scanner = new Scanner(System.in); //System.in means its coming from the console
			String answer = scanner.nextLine();
			if(answer.equals("yes")) {
				Global.money+=5;
				System.out.println("You have $" + Global.money + " and are using rusty scissors to cut the grass");
			}
			else if(answer.contentEquals("no")) {
				System.out.println("You still have $" + Global.money);
			}
		}
			
	}
	
	public static void fourth() {
		
		if(Global.money == 25) {
			System.out.println("Would you like to buy an old push mower?");
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if(answer.equals("yes")) {
				Global.money-=25;
				System.out.println("You have $" + Global.money);
				fifth();
			}
		}
			
	}
	
	public static void fifth() {	
		
		for(int x = 25; x <= 100; x+=25) {
			System.out.println("would you like to  cut the grass?");
			Scanner scanner = new Scanner(System.in); //System.in means its coming from the console
			String answer = scanner.nextLine();
			if(answer.equals("yes")) {
				Global.money+=25;
				System.out.println("You have $" + Global.money + " and are using an old push mower to cut the grass");
			}
			else if(answer.contentEquals("no")) {
				System.out.println("You still have $" + Global.money);
			}
		}
			
	}
	
	public static void sixth() {
			
		if(Global.money == 100) {
			System.out.println("Would you like to buy a fancy ride mower?");
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if(answer.equals("yes")) {
				Global.money-=100;
				System.out.println("You have $" + Global.money);
				seventh();
			}
		}
			
	}
	
	public static void seventh() {	
			
		for(int x = 25; x <= 100; x+=25) {
			System.out.println("would you like to  cut the grass?");
			Scanner scanner = new Scanner(System.in); //System.in means its coming from the console
			String answer = scanner.nextLine();
			if(answer.equals("yes")) {
				Global.money+=25;
				System.out.println("You have $" + Global.money + " and are using an old push mower to cut the grass");
			}
			else if(answer.contentEquals("no")) {
				System.out.println("You still have $" + Global.money);
			}
		}
			
	}

}
