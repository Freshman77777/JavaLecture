package ch06;

public class Ex01_Method {

	public static void main(String[] args) {
		int min = getMinimum(3, 4, 5);
		System.out.println(min);
		System.out.println(getMinimum(10, 20, 5));
		System.out.println(getMinimum(100, 83, 145));
	}

	static int getMinimum(int a, int b, int c) {
		int min = (a < b) ? a : b;
		min = (min > c) ? c : min;

		return min;
	}
}
