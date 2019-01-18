package lab6;

import java.util.Scanner;
import java.util.Random;

public class ThrowDemDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		
		System.out.println("Welcome to Grand Circus Casino!");
		
		
		String userInput;
		do {
		System.out.println("How many sides to the di?: ");
		int num = scnr.nextInt();	
		scnr.nextLine();
		
		int valueDie = generateRandomDieRoll(num);
		int valueDie2 = generateRandomDieRoll(num);
		
		System.out.println(valueDie +" , " + valueDie2);
		DiceRollerApp.poopDice(valueDie, valueDie2);
		
		System.out.println("Roll Again? (y/n)");
		userInput = scnr.nextLine();	 
		
		} while (userInput.equalsIgnoreCase("y"));
		
		
		
		 
		System.out.println("Good bye");
	
		scnr.close();

	}
	private static int generateRandomDieRoll(int num) {
		Random rand = new Random();
		
		int dice = rand.nextInt(num) + 1;
		return dice;
	
		
	}

//	private static void greet(String name) {
//		
//		System.out.println("Hello " + name);
//	}
}

	

	

