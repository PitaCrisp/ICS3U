package christopherakos;

import java.util.Scanner;

/*
 * Peter Christopherakos
 * March 23, 2016
 * Takes in a name and says whether it is the computer's favourite name or not
 */
public class RandomGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String userName;
		
		
		//Receiving user input
		System.out.println("Please enter your name.");
		userName = scan.nextLine();
		 
		//Random generator
		int random = (int)(Math.random()*10) + 1;
		
		if (random >= 4){
			
			System.out.println("That's my favourite name!!!");
		}
		else{
			
			System.out.println("I hate that name");	
			
		}
		
		
		
		
		
		
		
		
	}

}
