package ch07;

public class Ex13_Vehicle {
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}

class Bus extends Ex13_Vehicle {
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}

class Taxi extends Ex13_Vehicle {
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
}