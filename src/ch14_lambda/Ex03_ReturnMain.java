package ch14_lambda;

import java.util.function.BiFunction;

/**
 * With arguments, with return value
 */
public class Ex03_ReturnMain {

	public static void main(String[] args) {
		Ex03_MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(3, 4));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(3, 4));
		
		fi = (x, y) -> x + y;		// return 을 붙이면 에러
		System.out.println(fi.method(3, 4));

		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(3, 4));
		
		BiFunction<Integer, Integer, Integer> f = (x, y) -> x + y;
		System.out.println(f.apply(3, 4));
	}

	static int sum(int a, int b) {
		return a + b;
	}
}
