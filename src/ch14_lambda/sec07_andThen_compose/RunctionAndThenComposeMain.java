package ch14_lambda.sec07_andThen_compose;

import java.util.function.Function;

/**
 * A.andThen(B)  ==>  B.compose(A)
 */
public class RunctionAndThenComposeMain {

	public static void main(String[] args) {
		Function<Member, Address> functionA = m -> m.getAddress();
		Function<Address, String> functionB = a -> a.getCity();
		
		Function<Member, String> functionAB = functionA.andThen(functionB);
		String city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시: " + city);
	}

}
