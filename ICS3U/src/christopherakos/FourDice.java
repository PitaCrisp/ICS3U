package christopherakos;

import java.util.Scanner;

/*
 * Peter Christopherakos
 * March 23, 2016
 * Determines whether the user or the computer rolled higher numbers.
 */
public class FourDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		String userName;
		System.out.println("Please enter your name.");
		userName = scan.nextLine();

		String inputted = "yes";

		while (inputted.equalsIgnoreCase("yes")) {

			int die1 = (int)(Math.random()*6)+1;
			int die2 = (int)(Math.random()*6)+1;

			int userScore = die1 + die2;

			int die3 = (int)(Math.random()*6)+1;
			int die4 = (int)(Math.random()*6)+1;

			int cpuScore = die3 + die4;


			if (userScore > cpuScore){
				System.out.println("Congratulations " + userName + " you win!!!");
				System.out.println("The score was " + userScore + " to " + cpuScore);
			}
			else if (cpuScore > userScore){
				System.out.println("Better luck next time, the computer wins");
				System.out.println("The score was " + cpuScore + " to " + userScore);
			}
			else {
				System.out.println("It's a tie");

			}
			
			System.out.println("Do you want to continue?");
			inputted = scan.nextLine();
			
			
		}








	}

}
