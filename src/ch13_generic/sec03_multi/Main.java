package ch13_generic.sec03_multi;

public class Main {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트 TV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("전륜구동");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(carModel);
	}

}
