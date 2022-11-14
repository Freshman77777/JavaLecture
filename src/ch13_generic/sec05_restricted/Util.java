package ch13_generic.sec05_restricted;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {	// Number 하위 객체
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		System.out.println(t1.getClass().getName());
		System.out.println(t2.getClass().getName());
		return Double.compare(v1, v2);
	}
}
