package ch06;

public class Ex15_Static {
	static double pi = 3.14159;
	static final double PI = 3.14159;
	int x;				// instance field
	
	static int power(int base, int exponent) {
		int res = 1;
		for (int i = 1; i <= exponent; i++)
			res *= base;
		return res;
	}
	
	static double circleArea(double radius) {
		return pi * radius * radius;
	}
	
	int power2() {		// instance method
		int res = 1;
		System.out.println(pi);
		for (int i = 1; i <= x; i++)
			res *= 2;
		return res;
	}
}
