package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		robot.penDown();
		robot.setSpeed(100);
		
		String shape = JOptionPane.showInputDialog("What shape?");
		
		String color = JOptionPane.showInputDialog("What color?");
		
		if (color.equals("red")) {
			robot.setPenColor(Color.red);
		}
		else if (color.equals("green")) {
			robot.setPenColor(Color.green);
		}
		else if (color.equals("blue")) {
			robot.setPenColor(Color.blue);
		}
		else {
			robot.setRandomPenColor();
		}
		
		if (shape.equals("square")) {
			drawSquare(robot);
		}
		else if (shape.equals("triangle")) {
			drawTriangle(robot);
		}
		else if (shape.equals("circle")) {
			drawCircle(robot);
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid shape");
		}
	}
		
	public static void drawSquare(Robot rob) {
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}
	
	public static void drawTriangle(Robot rob) {
		for (int i = 0; i < 3; i++) {
			rob.move(100);
			rob.turn(360/3);
		}

	}
	
	public static void drawCircle(Robot rob) {
		for (int i = 0; i < 180; i++) {
			rob.move(2);
			rob.turn(2);
		}
	}
}








