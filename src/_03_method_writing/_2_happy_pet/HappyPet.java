package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	public static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while (happinessLevel < 10) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "HappyPet",
					0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "Go for a walk" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			switch (task) {
			case 0:
				cuddle(pet);
				break;
			case 1:
				feed(pet);
				break;
			case 2:
				goForWalk(pet);
				break;
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
		
		JOptionPane.showMessageDialog(null, "Your " + pet + " is very happy!\nYou must love them ver much!");
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void cuddle(String pet) {
		JOptionPane.showMessageDialog(null, "The " + pet + " seems happy!");
		happinessLevel++;
	}
	
	public static void feed(String pet) {
		JOptionPane.showMessageDialog(null, "The " + pet + " eats a hearty meal");
		happinessLevel++;
	}
	
	public static void goForWalk(String pet) {
		JOptionPane.showMessageDialog(null, "The " + pet + " happily plays in the fields");
		happinessLevel++;
	}
}