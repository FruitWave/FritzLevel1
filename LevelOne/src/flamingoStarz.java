import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the variable in
 * this recipe. 2. ask students what Tortoise commands they think they will use
 * to make picture in the lamins ated hand-outs.
 */

public class flamingoStarz {
	public static void main(String[] args) {

		int bottomFlabber = 300; // the size of the black part of the star
		int flamingoFatness = 200; // the length of the flaming arms

		Tortoise.moveTo(100, 50);
		
		 
		Tortoise.show();
		Tortoise.setPenColor(Color.pink);
		
		Tortoise.setSpeed(10);
		// 13. Make all the code below repeat 25 times
		for (int amazinglylogandpointlesslynamedbutactuallyprettyinteristinglynamedvariabletorepresentavariableinaforloop = 0; amazinglylogandpointlesslynamedbutactuallyprettyinteristinglynamedvariabletorepresentavariableinaforloop >= -1; amazinglylogandpointlesslynamedbutactuallyprettyinteristinglynamedvariabletorepresentavariableinaforloop++) {

			 
			Tortoise.turn(+ 360/8);
			 
			Tortoise.move(64);

			 
			Tortoise.turn(-40);
			Tortoise.setPenColor(Color.YELLOW);
			 
			Tortoise.move(flamingoFatness);

			Tortoise.turn(170);

			Tortoise.move(flamingoFatness);

			Tortoise.setPenColor(Color.pink);

			Tortoise.turn(64);

			Tortoise.move(bottomFlabber);
		}
		
	}
	}
	


