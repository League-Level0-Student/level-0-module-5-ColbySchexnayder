package _99_extra;

import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Robot[] robots = new Robot[5];
		// [Robot] [Robot] [Robot]  [Robot]  [Robot]
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(50 + i * 50);
			robots[i].setSpeed(100);
			robots[i].penDown();
		}
		
		for (Robot r : robots) {
			for (int i = 0; i < 5; i++) {
				r.move(100);
				r.turn(144);
			}
			r.hide();
		}
		
		
		
		ArrayList<Robot> listRobots = new ArrayList<Robot>();
		for (int i = 0; i < 5; i++) {
			listRobots.add(new Robot());
			Robot r = listRobots.get(i);
			r.setX(700 - i * 50);
			r.penDown();
			r.setSpeed(100);
		}
		
		for (Robot r : listRobots) {
			for (int i = 0; i < 5; i++) {
				r.move(100);
				r.turn(144);
			}
			r.hide();
		}
		
		robots[0].move(100);
		listRobots.get(0).move(100);
		System.out.println(robots.length);
		System.out.println(listRobots.size());
		
		robots[0] = null;
		listRobots.remove(0);
		System.out.println(robots.length);
		System.out.println(listRobots.size());
		
		for (int i = 0; i < listRobots.size(); i++) {
			
		}
	}

}











