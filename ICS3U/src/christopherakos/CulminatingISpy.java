package christopherakos;



import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import hsa_new.Console;
/*
 * Peter Christopherakos
 * June 2, 2016
 * Creating a click based game for I Spy
 */



public class CulminatingISpy {
	
	

int score;
//Creating images
static Image iSpyLevelOne = Toolkit.getDefaultToolkit().getImage("ISpyLevelOne.jpg");
static Image iSpyLevelTwo = Toolkit.getDefaultToolkit().getImage("ISpyLevelTwo.jpg");
static Image iSpyLevelThree = Toolkit.getDefaultToolkit().getImage("ISpyLevelThree.jpg");
static Image xImage = Toolkit.getDefaultToolkit().getImage("XImage.png");
static Image iSpyLogo = Toolkit.getDefaultToolkit().getImage("ISpyLogo.jpg");


//Setting crosses for each click
static int x,y;
static boolean[] crossedOne = new boolean[4];
static boolean[] crossedTwo = new boolean[4];
static boolean[] crossedThree = new boolean[4];
static String level = "One";

public static Console c = new Console();

static String input;


	public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		// TODO Auto-generated method stub
			
			/*Clip Jeopardy_Theme = null;
			try {
				Jeopardy_Theme = AudioSystem.getClip();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
	
			
				Jeopardy_Theme.open(AudioSystem.getAudioInputStream(new File("Jeopardy_Theme.wav")));
			*/
				
		c.println("In this game your objective is to click and find each item(s) for each level.");
		c.println("Would you like to play? (Yes/No)");
		input = c.readLine();
		
		if(input.equalsIgnoreCase("Yes")){
			
			levelOne();
		}
		else{
			c.close();
		}
		c.addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent me) {
				x = me.getX();
				y = me.getY();
				//c.print(x + ", " + y + " "); //shows coordinates
				
				if(level.equals("One")){//Level One
					if(x>=344&&x<=364&&y>=288&&y<=305){
						c.drawImage(xImage, 315, 202, 40, 40, null);
						crossedOne[0] = true;
						clearXY();
					}
					else if(x>=19&&x<=78&&y>=353&&y<=384){
						c.drawImage(xImage, 0, 250, 80, 80, null);
						crossedOne[1] = true;
						clearXY();
					}
					else if(x>=115&&x<=143&&y>=188&&y<=211){
						c.drawImage(xImage, 92, 105, 40, 40, null);
						crossedOne[2] = true;
						clearXY();
					}
					else if(x>=377&&x<=405&&y>=104&&y<=126){
						c.drawImage(xImage, 350, 20, 50, 50, null);
						crossedOne[3] = true;
						clearXY();
					}
					
				}
				else if(level.equals("Two")){//Level Two
					//c.print(x + ", " + y + " "); //shows coordinates
					if(x>=132&&x<=163&&y>=267&&y<=298){
						c.drawImage(xImage, 110, 192, 50, 50, null);
						crossedTwo[0] = true;
						clearXY();
					}
					else if(x>=54&&x<=93&&y>=496&&y<=533){
						c.drawImage(xImage, 33, 410, 50, 60, null);
						crossedTwo[1] = true;
						clearXY();
					}
					else if(x>=475&&x<=551&&y>=520&&y<=551){
						c.drawImage(xImage, 465, 450, 70, 40, null);
						crossedTwo[2] = true;
						clearXY();
					}
					else if(x>=227&&x<=263&&y>=375&&y<=407){
						c.drawImage(xImage, 200, 300, 50, 50, null);
						crossedTwo[3] = true;
						clearXY();
					}
				}
				else{//Level Three
					//c.print(x + ", " + y + " "); //shows coordinates
					if(x>=346&&x<=373&&y>=507&&y<=536){
						c.drawImage(xImage, 325, 415, 50, 50, null);
						crossedThree[0] = true;
						clearXY();
					}
					else if(x>=141&&x<=170&&y>=301&&y<=321){
						c.drawImage(xImage, 115, 210, 50, 50, null);
						crossedThree[1] = true;
						clearXY();
					}
					else if(x>=596&&x<=611&&y>=253&&y<=267){
						c.drawImage(xImage, 565, 170, 40, 40, null);
						crossedThree[2] = true;
						clearXY();
					}
					else if(x>=539&&x<=580&&y>=551&&y<=569){
						c.drawImage(xImage, 500, 460, 50, 50, null);
						crossedThree[3] = true;
						clearXY();
				}
					
				}
			} 
		});
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(level.equals("One")){//Level One
				
				if(allAreTrue(crossedOne)){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					level = "Two";
					
					c.clear();
					c.println("Level One complete, would you like to proceed? (Yes/No)");
					input = c.readLine();
					if(input.equalsIgnoreCase("Yes")){
						levelTwo();
					}
					else{
						c.close();
					}
					
				}
			}
			else if(level.equals("Two")){//Level Two
				
				if(allAreTrue(crossedTwo)){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					level = "Three";
					
					c.clear();
					c.println("Level Two complete, would you like to proceed? (Yes/No)");
					input = c.readLine();
					if(input.equalsIgnoreCase("Yes")){
						levelThree();
					}
					else{
						c.close();
					}
					
				}
			}
			else{//Level Three
				
				if(allAreTrue(crossedThree)){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//level = "end";  //Error Occurs right here!!!!!!!!!!!!!!!!!!!!
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					c.clear();					
					endScreen();				
				}
			}
		}
	}
	public static void clearXY(){
		x=0;
		y=0;
	}
	public static boolean allAreTrue(boolean[] array){
		for(int i=0; i<array.length; i++){
			if(array[i]==false){
				return false;
			}
		}
		return true;
	}
	public static void levelOne() {
		c.clear();
		
		c.drawImage(iSpyLevelOne, 0, 0, c.maxx(), c.maxy(), null);
		
		String[] itemsOne = {"Clock  ", "  Yellow Dog  ", "  Green Crab  ", "  Orange Button  "};
		c.setCursor(c.maxrow(),0);
		c.print(" Items: ");
		for(int i=0; i<itemsOne.length; i++){
			c.print(itemsOne[i] + " ");
			
		}
		
		
			
	}
	
	public static void levelTwo() {
		c.clear();
		c.drawImage(iSpyLevelTwo, 0, 0, c.maxx(), c.maxy(), null);
		String[] itemsTwo = {"Scissors  ", "  Baseball  ", "  Green Truck  ", "  Protractor  "};
		c.setCursor(c.maxrow(),0);
		c.print(" Items: ");
		for(int i=0; i<itemsTwo.length; i++){
			c.print(itemsTwo[i] + " ");
			
		}
		
	}
	
	public static void levelThree() {
		c.clear();
		c.drawImage(iSpyLevelThree, 0, 0, c.maxx(), c.maxy(), null);
		String[] itemsTwo = {"Gold Duck  ", "  Black Phone  ", "  Pool Ball  ", " Gold Bike  "};
		c.setCursor(c.maxrow(),0);
		c.print(" Items: ");
		for(int i=0; i<itemsTwo.length; i++){
			c.print(itemsTwo[i] + " ");
			
		}
		
	}
	public static void endScreen(){
		
		c.clear();
		//while(!Toolkit.getDefaultToolkit().prepareImage(iSpyLogo, iSpyLogo.getWidth(null), iSpyLogo.getHeight(null), null)){}
		//c.drawImage(iSpyLogo, 0, 0, c.maxx(), c.maxy(), null);
		
		c.setCursor(c.maxrow(),0);
		c.println(" Level Three complete, Congratulations you beat the game!!!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		c.close();
	}

}

