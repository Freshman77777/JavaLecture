package ch08;

public class Ex04_Main {

	public static void main(String[] args) {
		Ex04_Driver driver = new Ex04_Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}

class Bus implements Ex04_Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Taxi implements Ex04_Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}