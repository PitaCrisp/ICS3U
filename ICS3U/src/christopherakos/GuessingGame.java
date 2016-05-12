package christopherakos;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The program guesses what animal you were thinking of
		
		
		String [] guess=new String []{"lion","tiger","leapord","ostrich","mouse", "elephant", "snake", "lizard", "ant","spider","dog","cat","hampster","bird","zeebra","horse","goat","turtle","unicorn","dragon"};
		boolean [] guessed =new boolean [20];
		Scanner scan = new Scanner (System.in);
		String YesOrNo;
		int i=0;
		

		
		
		
		
		System.out.println("Wanna play a guessing game? Think of the animal you want to choose.");
		System.out.println("Ready to play? Yes or No");
		
		YesOrNo=scan.nextLine();
		
	
		
		if (YesOrNo.equalsIgnoreCase("Yes"))
		{
			
			do
			{	
				
				int x=(int)(Math.random()*guess.length);
				
				if (!guessed[x]){
					guessed[x]=true;
					System.out.println("Is it a "+guess[x]+"? Yes or No");
					YesOrNo=scan.nextLine();
					i++;
					if (YesOrNo.equalsIgnoreCase("Yes"))
						System.out.println("I Win :)");
				}
				
				if (i==guess.length)
				{
					System.out.println("I dont have another guess, you win");
					YesOrNo="Yes";
				}
								
				
			}while (YesOrNo.equalsIgnoreCase("No"));
			
			
		}
		else
		{
			System.out.println("See you later");
		}
	}

}
