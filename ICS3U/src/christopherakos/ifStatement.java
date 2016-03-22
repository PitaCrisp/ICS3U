package christopherakos;

import java.util.Scanner;

/*
 * Peter Christopherakos
 * March 22, 2016
 * First ifStatement Program
 */
public class ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		//taking in user input
		System.out.println("Please enter an integer");
		int integer = Integer.parseInt(scan.nextLine());

		//determining whether the integer is positive or not
		if (integer >=0){
			System.out.println("The integer is positive!");
		}

		else {
			System.out.println("The integer is not positive");
		}
		//determining whether the integer is divisible by 7 or not
		if (integer % 7 ==0){
			System.out.println("The integer is divisible by 7!");
		}

		else {
			System.out.println("The integer is not divisible by 7");
		}
	}



}
