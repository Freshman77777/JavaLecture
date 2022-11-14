package ch14_lambda;

import java.util.function.IntPredicate;

public class Ex08_AndOrNegate {

	public static void main(String[] args) {
		// 2�� ��� �˻�
		IntPredicate pA = a -> a % 2 == 0;
		// 3�� ��� �˻�
		IntPredicate pB = a -> a % 3 == 0;
		
		// and()
		IntPredicate pAB = pA.and(pB);	// 2�� ����̸鼭 3�� ���, 2�� 3�� �����
		System.out.println(pAB.test(6));
		System.out.println(pAB.test(9));
		
		// or()
		pAB = pA.or(pB);	// 2�� ����̰ų� 3�� ���
		System.out.println(pAB.test(5));
		System.out.println(pAB.test(15));
		
		// negate(): not
		pAB = pA.negate();
		System.out.println(pAB.test(6));
		System.out.println(pAB.test(9));
	}

}
