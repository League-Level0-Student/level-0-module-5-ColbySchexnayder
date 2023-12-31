package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {

		SkillPractice skillPractice = new SkillPractice();
		skillPractice.skill1();
		skillPractice.skill2();
		skillPractice.skill3();
		skillPractice.skill4();
		skillPractice.skill5();
		
		SkillPractice.foo();
	}

	static void foo() {
		System.out.println("....");
	}
	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String sDimes = JOptionPane.showInputDialog("How many dimes do you have?");
		// Tell them how many cents they have (hint multiply by 10)
		int cents = Integer.parseInt(sDimes) * 10;
		JOptionPane.showMessageDialog(null, "You have " + cents + " cents");
		// Ask the user how tall they are (inches)
		String input = JOptionPane.showInputDialog("How tall are you?");
		int height = Integer.parseInt(input);
		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (height < 36) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties");
		}
	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i <= 30; i+=3) {
			System.out.println(i);
		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		Random ran = new Random();
		int num = ran.nextInt(20);
		System.out.println(num);
		// Get another random number that is less than 10 and print it to the console
		int num2 = ran.nextInt(10);
		System.out.println(num2);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		JOptionPane.showMessageDialog(null, "" + num + "-" + num2 + "=" + (num-num2));
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City
		if (city.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City");
		}
		else {
			JOptionPane.showMessageDialog(null, "Move to San Diego");
		}
		// Otherwise, tell them to move to San Diego
		int cars = 0;
		if (cars == 0) {
			JOptionPane.showMessageDialog(null, "You must use public transportation");
		}
		else if (cars == 1) {
			JOptionPane.showMessageDialog(null, "2002 Subaru Impreza");
		}
		else {
			JOptionPane.showMessageDialog(null, "" + (cars * 4) + " wheels total");
		}
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."

		// If there is 1 car, use a pop-up to display the make/model of the car

		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school
		String school = JOptionPane.showInputDialog("What's the name of your school?");
		JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.

	}
}
