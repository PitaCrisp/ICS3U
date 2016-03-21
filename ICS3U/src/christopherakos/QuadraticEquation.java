package christopherakos;
/*
 * Peter Christopherakos
 * March 21, 2016
 * Finding two roots using the quadratic equation
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
			
				
				DecimalFormat df = new DecimalFormat ("#0.0");
				
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Equations in Standard Form: ax^2 + bx + c = 0");
				
				System.out.println("Please Enter The Value of 'a'");
				double a = Double.parseDouble(scan.nextLine());

				System.out.println("Please Enter The Value of 'b'");
				double b = Double.parseDouble(scan.nextLine());

				System.out.println("Please Enter The Value of 'c'");
				double c = Double.parseDouble(scan.nextLine());
				
				
				double discriminant = b * b - 4 * a * c;
				
				if (a == 0) {
					System.out.println("Cannot Solve");
					System.out.println("Equation is not Quadratic");
					
				}
				else {
					
					if (discriminant > 0) {
						System.out.println("Two Solutions: ");
						double ZeroOne = (-1 * b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
						double ZeroTwo = (-1 * b - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
						System.out.println("Zero one = " + df.format(ZeroOne));
						System.out.println("Zero two = " + df.format(ZeroTwo));
					}
					else if (discriminant == 0) {
						System.out.println("One Solution: ");
						double ZeroOne = (-1 * b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
						System.out.println("Zero one = " + df.format(ZeroOne));
					
					}
					else {
						System.out.println("No Solutions Available");
					
					}
				}
			}
		

		
		
			

				
				
				
				
				

}
