package ch07;

public class Ex21_Main {

	public static void main(String[] args) {
		// 추상 클래스는 객체화할 수 없다.
//		Ex21_Phone phone = new Ex21_Phone("홍길동");
		
		// 사용하려면 추상 클래스를 상속받은 클래스를 객체화 시켜야 한다.
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
