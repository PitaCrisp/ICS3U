package christopherakos;
import java.util.Scanner;
public class ListOfNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of names that will be inputted");
		int x=Integer.parseInt(scan.nextLine());
		
		String [] names=new String [x];
		
		System.out.println("Enter the names");
		for (int i=0;i<x;i++)
		{
			names[i]=scan.nextLine();
		}
		for (int i=0;i<x;i++)
		{
			System.out.println(names[i]);
		}
		for (int i=x-1;i>=0;i--)
		{
			System.out.println(names[i]);
		}
	}

}
