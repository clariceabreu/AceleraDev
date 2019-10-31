package Entities;

public class Elevator {
	int floor = 0;
	int floorsCount;
	int capacity;
	int occupation = 0;
	
	public Elevator(int floorsCount, int capacity) {
		this.floorsCount = floorsCount;
		this.capacity = capacity;
	}
	
	public void peopleEnter(int numberOfPeople) {
		if (this.occupation + numberOfPeople <= this.capacity) {
			this.occupation += numberOfPeople;
			StringBuilder builder = new StringBuilder();
			builder.append("Quantidade de pessoas no elevador: ").append(this.occupation);
			System.out.println(builder.toString());
		}
		else System.out.println("Não é possível entrar essa quantidade de pessoas, ultrapassa a capacidade máxima do elevador!");
	}
	
	public void peopleLeave(int numberOfPeople) {
		if (this.occupation - numberOfPeople >= 0) {
			this.occupation -= numberOfPeople;
			StringBuilder builder = new StringBuilder();
			builder.append("Quantidade de pessoas no elevador: ").append(this.occupation);
			System.out.println(builder.toString());
		}
		else System.out.println("Impossível sair essa quantidade de pessoas, a ocupação do elevador é inferior!");
	}
	
	public void goUp(int numberOfFloors) {
		if (this.floor + numberOfFloors <= this.floorsCount) {
			this.floor += numberOfFloors;
			StringBuilder builder = new StringBuilder();
			builder.append("Andar atual: ").append(floor);
			System.out.println(builder.toString());
		}
		else System.out.println("Impossível subir essa quantidade de andares");
	}
	
	public void goDown(int numberOfFloors) {
		if (this.floor - numberOfFloors >= 0) {
			this.floor -= numberOfFloors;
			if (this.floor == 0) System.out.println("Andar atual: Térreo");
			else {
				StringBuilder builder = new StringBuilder();
				builder.append("Andar atual: ").append(floor);
				System.out.println(builder.toString());
			}
		}
		else System.out.println("Impossível descer essa quantidade de andares");
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getFloorsCount() {
		return floorsCount;
	}

	public void setFloorsCount(int floorsCount) {
		this.floorsCount = floorsCount;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getOccupation() {
		return occupation;
	}

	public void setOccupation(int occupation) {
		this.occupation = occupation;
	}
}
