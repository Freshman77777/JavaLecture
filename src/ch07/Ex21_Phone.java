package ch07;

/**
 * �߻�(abstract) Ŭ����
 */
public abstract class Ex21_Phone {
	public String owner;

	Ex21_Phone(String owner) {
		this.owner = owner;
	}
	
	void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}

class SmartPhone extends Ex21_Phone {
	SmartPhone(String owner) {
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}