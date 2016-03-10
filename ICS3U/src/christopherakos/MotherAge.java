package christopherakos;
/**
 * Peter Christopherakos
 * March 10, 2016
 * This program is used to determine the age of the mother when her child was born through the input of names and years of birth. The output is the child's birth year subtracting the mother's birth year.
 * MotherAge.java
 */
import java.util.Scanner;

public class MotherAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		//Entering the names of the mother and child
		System.out.println("Please enter your name.");
		String Name = scan.nextLine();
		System.out.println("Please enter the name of your child.");
		String ChildName = scan.nextLine();
		
		//Entering the years the mother and child were born
		System.out.println("Please enter the year you, " + Name + " was born.");
		int MotherYear = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter the year you, " + ChildName + " was born.");
		int ChildYear = Integer.parseInt(scan.nextLine());
		
		//Outputting the age of the mother through subtracting the years they were born
		int BirthAge = ChildYear - MotherYear;
		System.out.println(Name + " you were " + BirthAge + " when " + ChildName + " was born!");

	}

}
