package lab6;

public class DiceRollerApp {
	 
	public static void poopDice(int valueDie , int valueDie2) {
		
		if ((valueDie == 1) && (valueDie2 == 1)) {
			System.out.println("Snake Eyes!");
		}else if (((valueDie + valueDie2)== 2) || ((valueDie + valueDie2)== 3) || ((valueDie + valueDie2)== 12)) {
			System.out.println("Craps! Poops!");
		}if ((valueDie == 6) & (valueDie2 == 6)){
			System.out.println("BOXCAR!");
		}
	}	
}


