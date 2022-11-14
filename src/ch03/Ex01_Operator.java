package ch03;

/**
 * 연산자(Operator)
 */
public class Ex01_Operator {

	public static void main(String[] args) {
		int a = 3;
		int b = a++;		// post increment
		System.out.printf("a = %d,\tb = %d\n", a, b);
		int c = ++a;		// pre increment
		System.out.printf("a = %d,\tc = %d%n", a, c);
		
		String s = (a % 2 == 0) ? "짝수" : "홀수";
		System.out.println(a + "은/는 " + s);
		
		int sum = 0;
		sum += 1;
		sum += 2;
		System.out.println(sum);
		sum = 0;
		for (int i=1; i<=10; i++)
			sum += i;
		System.out.println(sum);
		
		short s1 = 1;
		short ss = (short)-s1;		// 단항 연산자 -를 하면 결과가 int type이 됨
	}

}