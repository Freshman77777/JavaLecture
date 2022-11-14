package ch14_lambda;

import java.util.function.Consumer;

/**
 * With argument, no return value
 */
public class Ex02_ArgumentsMain {

	public static void main(String[] args) {
		Ex02_MyFunctionalInterface fi;
		
		fi = (x) -> {
			int result = x * x;
			System.out.println(result);
		};
		fi.method(3);
		
		fi = x -> { System.out.println(x * x); };
		fi.method(4);
		
		fi = x -> System.out.println(x * x);
		fi.method(5);
		
		Consumer<Integer> c = x -> System.out.println(x * x);
		c.accept(5);
	}

}
