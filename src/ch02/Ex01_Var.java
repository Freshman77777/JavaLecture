package ch02;

public class Ex01_Var {

	public static void main(String[] args) {
		int score = 90;		// ���� ������ �� �ʱⰪ�� �ο�
		int result = score * 2;
		
		/* Literal */
		int intLiteral = 30;		// integer
		int octal = 036;			// 8����(octal)
		int hexa = 0x1E;			// 16����(hexadecimal)
		System.out.println(intLiteral);
		System.out.println(octal);
		System.out.println(hexa);
		System.out.printf("%d, %d, %d%n", intLiteral, octal, hexa);
		
		double doubleLiteral = 3.14159;		// floating point(�Ǽ�)
		char charLiteral = 'a';		// single quote(����, ���� 1��)
		String strLiteral = "A quick brown fox";	// ���ڿ�
		boolean boolLiteral = true;		// true, false
		
		if (result > 100) {
			int score1 = 30;
			System.out.println(score1);
		}
//		System.out.println(score1);		// score1 ������ if block �ۿ����� ����� �� ����
	}

}