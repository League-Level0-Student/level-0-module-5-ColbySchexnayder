package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] arg) {
		
		String sNumber = JOptionPane.showInputDialog("Enter a number");
		int num = Integer.parseInt(sNumber);
		
		boolean prime = true;
		
		for (int i = 2; i < num/2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		
		if (prime) {
			JOptionPane.showMessageDialog(null, num + " is prime!");
		}
		else {
			JOptionPane.showMessageDialog(null, num + " is not prime!");
		}
	}
}
