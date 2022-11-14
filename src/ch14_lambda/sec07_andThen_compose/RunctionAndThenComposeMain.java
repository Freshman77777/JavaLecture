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
				new Member("ȫ�浿", "hong", new Address("�ѱ�", "����"))
		);
		System.out.println("���� ����: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
				new Member("ȫ�浿", "hong", new Address("�ѱ�", "����"))
		);
		System.out.println("���� ����: " + city);
	}

}
