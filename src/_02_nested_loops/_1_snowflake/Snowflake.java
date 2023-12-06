package _02_nested_loops._1_snowflake;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Snowflake {

	public static void main(String[] args) {

		// #1. Make a new Robot
		Robot rob = new Robot();

		// #2. Set your robot’s position to x=300 and y=300
		rob.setX(300);
		rob.setY(300);
		// #3. Put the robot's pen down
		rob.penDown();
		rob.setSpeed(100);

		for (int i = 0; i < 6; i++) {
			// #6. Set the pen color to black
			rob.setPenColor(Color.black);
			// #7. move the robot by 50
			rob.move(50);
			// #8. turn the robot to the right by 60
			rob.turn(60);
			// #12. set the pen color to blue for even numbers of i
			if (i % 2 == 0) {
				rob.setPenColor(Color.blue);
			}
			else {
				rob.setPenColor(Color.red);
			}
			for (int j = 0; j < 6; j++) {
				// #10. turn the robot to the left by 60
				rob.turn(-60);
				rob.move(50);
				// #11. move the robot by 50 (play the start button)
			}

			// #14. set the pen color to black
			rob.setPenColor(Color.black);
		}
		rob.hide();
	}

}
