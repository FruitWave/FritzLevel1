// Copyright Wintriss Technical Schools 2013
import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class sPyRoL {

	public static void main(String[] args) {
		/* Tortoise.moveTo(200, 60);
		for (int i = 0; i >= -1; i++) {
			float variSpir = 40 + i/3;
			Tortoise.setPenColor(Color.PINK);
			Tortoise.move(0 + variSpir);
			Tortoise.turn(90);
			Tortoise.setPenColor(Color.green);
			Tortoise.move(variSpir + i);
			Tortoise.setPenColor(Color.BLUE);
			Tortoise.move(variSpir + i*2);
		}
		
		Tortoise.setSpeed(10);
		Tortoise.setPenWidth(2);
		for (int i = 0; i >= -1; i++) {
			float variSpir = 40 + i/3;
			Tortoise.setPenColor(Color.PINK);
			Tortoise.move(0 + variSpir);
			Tortoise.turn(90);
			Tortoise.setPenColor(Color.green);
			Tortoise.move(variSpir + i);
			Tortoise.setPenColor(Color.BLUE);
			Tortoise.move(variSpir + i*2);
		}
		
		for (int fOreSpikx = 0; fOreSpikx >= -1; fOreSpikx++) {
			float variSpir = 40 + fOreSpikx/3;
				Tortoise.setPenColor(Color.PINK);
				Tortoise.move(variSpir);
				Tortoise.turn(90);
				Tortoise.setPenColor(Color.green);
				Tortoise.move(variSpir + fOreSpikx);
				Tortoise.setPenColor(Color.BLUE);
				Tortoise.move(variSpir + fOreSpikx*2);
		}
		*/
		
		// 3. Make a variable to hold the number of sides and set it to 0
		float intrilSlip = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String pixZr = JOptionPane.showInputDialog("Waddaya want, Sphiidaeo? You can choose from the typical shapes. Yo' know what I mean, Sphiidaeo...");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if (pixZr.equalsIgnoreCase("square")) {
			intrilSlip = 4;
		}
		if (pixZr.equalsIgnoreCase("pentagon")) {
			intrilSlip = 5;
		}
		if (pixZr.equalsIgnoreCase("triangle")) {
			intrilSlip = 3;
		}
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		
		Tortoise.setSpeed(10);
		Tortoise.setPenWidth(2);
		
		for (int fOreSpikx = 0; fOreSpikx >= -1; fOreSpikx++) {
			float variSpir = 40 + fOreSpikx/3;
			Tortoise.setPenColor(Color.PINK);
			Tortoise.move(variSpir);
			Tortoise.turn(360/intrilSlip);
			Tortoise.setPenColor(Color.green);
			Tortoise.move(variSpir + fOreSpikx);
			Tortoise.setPenColor(Color.BLUE);
			Tortoise.move(variSpir + fOreSpikx*2);
				Tortoise.setPenColor(Color.PINK);
				Tortoise.move(variSpir);
				Tortoise.turn(90);
				Tortoise.setPenColor(Color.green);
				Tortoise.move(variSpir + fOreSpikx);
				Tortoise.setPenColor(Color.BLUE);
				Tortoise.move(variSpir + fOreSpikx*2);
				
				Tortoise.setPenColor(Color.PINK);
				Tortoise.move(variSpir);
				Tortoise.turn(120);
				Tortoise.setPenColor(Color.green);
				Tortoise.move(variSpir + fOreSpikx);
				Tortoise.setPenColor(Color.BLUE);
				Tortoise.move(variSpir + fOreSpikx*2);
				
				Tortoise.setPenColor(Color.PINK);
				Tortoise.move(variSpir);
				Tortoise.turn(72);
				Tortoise.setPenColor(Color.green);
				Tortoise.move(variSpir + fOreSpikx);
				Tortoise.setPenColor(Color.BLUE);
				Tortoise.move(variSpir + fOreSpikx*2);
				Tortoise.setPenColor(Color.PINK);
				Tortoise.move(variSpir);
				Tortoise.turn(360/intrilSlip);
				Tortoise.setPenColor(Color.green);
				Tortoise.move(variSpir + fOreSpikx);
				Tortoise.setPenColor(Color.BLUE);
				Tortoise.move(variSpir + fOreSpikx*2);
				
				Tortoise.setPenColor(Color.PINK);
				Tortoise.move(variSpir);
				Tortoise.turn(360/intrilSlip);
				Tortoise.setPenColor(Color.green);
				Tortoise.move(variSpir + fOreSpikx);
				Tortoise.setPenColor(Color.BLUE);
				Tortoise.move(variSpir + fOreSpikx*2);
					Tortoise.setPenColor(Color.PINK);
					Tortoise.move(variSpir);
					Tortoise.turn(90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(variSpir + fOreSpikx);
					Tortoise.setPenColor(Color.BLUE);
					Tortoise.move(variSpir + fOreSpikx*2);
					
					Tortoise.setPenColor(Color.PINK);
					Tortoise.move(variSpir);
					Tortoise.turn(120);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(variSpir + fOreSpikx);
					Tortoise.setPenColor(Color.BLUE);
					Tortoise.move(variSpir + fOreSpikx*2);
					
					Tortoise.setPenColor(Color.PINK);
					Tortoise.move(variSpir);
					Tortoise.turn(72);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(variSpir + fOreSpikx);
					Tortoise.setPenColor(Color.BLUE);
					Tortoise.move(variSpir + fOreSpikx*2);
					Tortoise.setPenColor(Color.PINK);
					Tortoise.move(variSpir);
					Tortoise.turn(360/intrilSlip);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(variSpir + fOreSpikx);
					Tortoise.setPenColor(Color.BLUE);
					Tortoise.move(variSpir + fOreSpikx*2);
		}
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}
/*
 	Tortoise.setPenColor(Color.PINK);
				Tortoise.move(variSpir);
				Tortoise.turn(360/intrilSlip);
				Tortoise.setPenColor(Color.green);
				Tortoise.move(variSpir + fOreSpikx);
				Tortoise.setPenColor(Color.BLUE);
				Tortoise.move(variSpir + fOreSpikx*2);
					Tortoise.setPenColor(Color.PINK);
					Tortoise.move(variSpir);
					Tortoise.turn(90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(variSpir + fOreSpikx);
					Tortoise.setPenColor(Color.BLUE);
					Tortoise.move(variSpir + fOreSpikx*2);
					
					Tortoise.setPenColor(Color.PINK);
					Tortoise.move(variSpir);
					Tortoise.turn(120);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(variSpir + fOreSpikx);
					Tortoise.setPenColor(Color.BLUE);
					Tortoise.move(variSpir + fOreSpikx*2);
					
					Tortoise.setPenColor(Color.PINK);
					Tortoise.move(variSpir);
					Tortoise.turn(72);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(variSpir + fOreSpikx);
					Tortoise.setPenColor(Color.BLUE);
					Tortoise.move(variSpir + fOreSpikx*2);
					Tortoise.setPenColor(Color.PINK);
					Tortoise.move(variSpir);
					Tortoise.turn(360/intrilSlip);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(variSpir + fOreSpikx);
					Tortoise.setPenColor(Color.BLUE);
					Tortoise.move(variSpir + fOreSpikx*2);
 */
}

