
import hsa_new.Console;
public class TheHuntForAdamS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Console c = new Console(); 
		String bridgeOption;
		String underOption;
		String runOption;
		String cabinOption;
		String mapOption;
		String trailOption;
		int userChoice2 = 0;

		c.println("You find a rickety bridge in the middle of nowhere, do you want to CROSS the bridge or go UNDER?");
		bridgeOption = c.readLine();

		if (bridgeOption.equalsIgnoreCase ("CROSS")){
			int lifeChance = (int)(Math.random()*10) + 1;
			if (lifeChance > 5){

				c.println("You made it across safe and sound.");
				c.println("As you reach solid land again you walk until you find a broken down house surrounded by a forest. It's sketchy from the outside, do you go into the HOUSE or go into the WOODS?");
				cabinOption = c.readLine();

				if (cabinOption.equalsIgnoreCase("House")){
					c.println("You enter a dusty house, it feels safe but mysterious. Fatigued you sit down and find a map on the table. Do you follow the MAP or go to SLEEP?");
					mapOption = c.readLine();

					if (mapOption.equalsIgnoreCase("MAP")){
						int lifePercent = (int)(Math.random()*10)+1;
						if (lifePercent > 3){

							c.println("You die a painful death starving in the woods");
						}
						else { 
							c.println("You begin to slowly fade away as a glowing figure comes to your rescue, it is ADAM S, YOU WIN!!!!!!!!!!");
						}
					}
					else{
							
						c.println("You wake up refreshed and ready to explore, however when you get outside there are a fresh pair of footprints. Do you follow the FOOTPRINTS or follow the TRAIL on the map?");
						trailOption = c.readLine();
						if(trailOption.equalsIgnoreCase("FOOTPRINTS")){
							c.println("You follow the footprints and without paying attention you fall into a deep hole. It was innevitable that you will spend your last days there.");
							
						}
						else{
							c.println("You take the map, leaving the mysterious footprints behind. Without missing a step you follow the trail and end up with the man himself standing before you. Congratulations, you have found ADAM S!!!!!!!!!!!!!");
							
						}
					
					}
				}
					
				else{
					int adamChance = (int)(Math.random()*10) + 1;
					if (adamChance > 7){
						c.println("As you enter the dark woods something flashes by you. Ahead in the distance you see it...or not an it, but a him. ITS ADAM S, YOU WIN!!!!");
					}
					else{
						c.println("You run into a pack of animals");
						int numberChoice = (int)(Math.random()*10)+1;
						for (int i = 1; i<=3; i++){
							c.println("Guess a number from 1 - 10");
							userChoice2 = Integer.parseInt(c.readLine());
							
							if (userChoice2 == numberChoice){
								i = 4;
							}
								
						}
					
						if (userChoice2 == numberChoice){
						c.println("You guessed the right number, the animals show you the way to ADAM S!!!!!!!");
						}
						
						else{
						c.println("You guessed wrong, you scream as the animals close in on you");
						}
						
					}


				
			}
		}
		
		else{

			c.println("As you cross the bridge everything snaps and you fall to your inevitable death.");	

		}
	}
	else if (bridgeOption.equalsIgnoreCase("UNDER")){
		c.println("You come upon a river after going under the bridge, what do you do? Will you SWIM across or take the ROCKS...");
		underOption = c.readLine();

		if (underOption.equalsIgnoreCase ("SWIM")){
			c.println("When you start swimming you are overpowered by the poisonous water and slowly die");
		}

		else{
			c.println("You hop across the rocks and come upon a small shore");
			c.println("In the distance you see a shady figure run into the trees, do you RUN or FOLLOW?");
			runOption = c.readLine();

			if (runOption.equalsIgnoreCase("RUN")){
				c.println("You run as fast as you can, but the shady figure is catching up. You trip which leads to your own murder.");
			}
			else{
				c.println("As you chase down the person running away you begin to realize that they look familiar. It is then that you come into a clearing and they turn around. It's ADAM S!!!!!!!!!!! Congratulations you win :D");
			}
		}











	}
}
}



import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import hsa_new.Console;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

Clip river = AudioSystem.getClip();
Clip roar = AudtioSystem.getClip();

themeriver.open(AudioSystem.getAudioInputStream(new File("location of file"))); 
themeroar.open(AudioSystem.getAudioInputStream(new File("location of file")));

