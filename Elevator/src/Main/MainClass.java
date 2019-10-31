package Main;

import Entities.Elevator;

public class MainClass {
	public static void main(String[] args) {
		Elevator elevator = new Elevator(10, 5);
		elevator.peopleEnter(2);
		elevator.peopleEnter(2);
		elevator.peopleEnter(2);
		
		elevator.peopleLeave(3);
		elevator.peopleLeave(5);
		
		elevator.goUp(8);
		elevator.goDown(2);
		elevator.goUp(5);
		elevator.goUp(4);
		elevator.goDown(10);
		elevator.goUp(5);
	}
}
