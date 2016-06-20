package christopherakos;


import java.util.Scanner;
//Peter Christopherakos
//May 12, 2016
//Guesses what word you are thinking of
public class WordGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Guess;
		char Letter;
		String [] WordList={"Monkey", "Banana", "Tree", "Gorilla", "Swing", "Platypus", "Ostrich", "Hello", "Goodbye", "AdamS"};
		int x=(int)(Math.random()*WordList.length);
		Scanner scan = new Scanner(System.in);
		int numGuess;
		
	    String dashes="";
	    for (int i=0;i<WordList[x].length();i++)
	    {
	    	dashes=dashes+"-";
	    }
	    System.out.println(dashes);
	    
	    do
	    {
	    	System.out.println("Please enter a letter(enter ! if you want to guess the word)");
	    	Guess=scan.nextLine();
	    	
	    	if (Guess=="!")
	    	{
	    		
	    	}
	    	else
	    	{
	    		int num=WordList[x].indexOf(Guess);
	    	}
	    	
	    	
	    }
	    while(true){}
	    
	    
	
	}

}
