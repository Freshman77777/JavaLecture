package ch07;

public class Ex21_Main {

	public static void main(String[] args) {
		// �߻� Ŭ������ ��üȭ�� �� ����.
//		Ex21_Phone phone = new Ex21_Phone("ȫ�浿");
		
		// ����Ϸ��� �߻� Ŭ������ ��ӹ��� Ŭ������ ��üȭ ���Ѿ� �Ѵ�.
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}

