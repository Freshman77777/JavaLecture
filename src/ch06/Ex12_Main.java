package ch06;

public class Ex12_Main {

	public static void main(String[] args) {
		Ex12_Car car = new Ex12_Car();	// 객체 생성
		car.company = "현대자동차";
		car.color = "은색";
		car.model = "Ionic6";
		car.maxSpeed = 200;
		System.out.println(car.company + ", " + car.model + ", " +
				car.color + ", " + car.maxSpeed);
		System.out.println(car);	// 객체명을 쓰면 자동적으로 toString() 메쏘드 호출
		
		Ex12_Car bus = new Ex12_Car();	// 객체 생성
		bus.company = "기아자동차";
		bus.model = "리무진";
		bus.color = "분홍색";
		bus.maxSpeed = 180;
		bus.printField();
		System.out.println(bus.toString());
		
		Ex12_Car taxi = new Ex12_Car("현대자동차");
		taxi.model = "소나타";
		taxi.color = "흰색";
		taxi.maxSpeed = 180;
		System.out.println(taxi);
	}
}
