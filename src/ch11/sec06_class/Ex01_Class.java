package ch11.sec06_class;

public class Ex01_Class {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		System.out.println();
		
		try {
			clazz = Class.forName("ch11.sec06_class.Car");
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackageName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
