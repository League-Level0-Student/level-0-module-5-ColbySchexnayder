package _01_algorithms._2_fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {
	// 0 1 1 2 3 5
	
	// user enters number
	// num1 = 0
	// num2 = 1
	// sum
	//print num1
	// loop 1, number
		//print num2
		//sum = num1 + num2
		//num1 = num2
		//num2 = sum
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a number");
		int length = Integer.parseInt(input);
		
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		
		System.out.print(num1 + " ");
		
		for (int i = 1; i < length; i++) {
			System.out.print(num2 + " ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
}
