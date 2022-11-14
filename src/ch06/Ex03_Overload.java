package ch06;

/**
 * Method overloading
 */
public class Ex03_Overload {

	public static void main(String[] args) {
		int min = getMinimum(3, 4, 5);
		System.out.println(min);
		System.out.println(getMinimum(10., 20., 5.));
		System.out.println(getMinimum(100, 83, 145));
		System.out.println(getMinimum(5, 28));
	}

	static int getMinimum(int a, int b) {
		return getMinimum(a, a, b);
	}
	static int getMinimum(int a, int b, int c) {
		int min = (a < b) ? a : b;
		min = (min > c) ? c : min;

		return min;
	}
	static double getMinimum(double a, double b, double c) {
		double min = (a < b) ? a : b;
		min = (min > c) ? c : min;

		return min;
	}
}
