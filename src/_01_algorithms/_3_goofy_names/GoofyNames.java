package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String name = JOptionPane.showInputDialog("What's your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.
		System.out.println(name.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 7).
		// HINT: Use .length() to determine the number of characters in the String.
		for (int i = 0; i < name.length(); i++) {
			// 4. Create a char variable to store the next character of the name
			// use .charAt()

			char letter = name.charAt(i);
			// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
			if (i % 2 == 0) {
				letter = Character.toUpperCase(letter);
			} else {
				letter = Character.toLowerCase(letter);
			}

			goofyName += letter;

		}
		
		JOptionPane.showMessageDialog(null, goofyName);
		// 8. Use pop-up to show user their Goofy name

	}
}
