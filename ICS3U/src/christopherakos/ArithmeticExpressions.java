package christopherakos;
/*
 * Peter Christopherakos
 * March 21, 2016
 * Arithmetic Expressions Program
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArithmeticExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat ("#0.0");
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number for the following values");

		System.out.println("Please Enter The Value of 'a'");
		double a = Double.parseDouble(scan.nextLine());
		
		System.out.println("Please Enter The Value of 'b'");
		double b = Double.parseDouble(scan.nextLine());
		
		System.out.println("Please Enter The Value of 'c'");
		double c = Double.parseDouble(scan.nextLine());
		
		System.out.println("Please Enter The Value of 'd'");
		double d = Double.parseDouble(scan.nextLine());
		
		System.out.println("Please Enter The Value of 'e'");
		double e = Double.parseDouble(scan.nextLine());
		
		
		double outputOne = a+b+c+d+e;
		System.out.println("The sum of all the numbers is " + outputOne);
		
		double outputTwo = c-b;
		System.out.println("The third number subtracting the second equals " + outputTwo);
		
		double outputThree = a*e;
		System.out.println("The first number multiplied by the fifth is " + outputThree);
		
		double outputFour = d/b;
		System.out.println("The fourth number multiplied by the second equals " + outputFour);
		
		double outputFive = d % b;
		System.out.println("The quotient of the fourth to second number is " + outputFive);
		
		double outputSix = Math.pow(a, c);
		System.out.println("The first number to the power of the third is " + outputSix);
		
		double outputSeven = Math.sqrt(e);
		System.out.println("The square root of the seventh number is " + outputSeven);
		
		
		
		
	}

}
