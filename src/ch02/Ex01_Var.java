package ch02;

public class Ex01_Var {

	public static void main(String[] args) {
		int score = 90;		// 변수 선언할 때 초기값을 부여
		int result = score * 2;
		
		/* Literal */
		int intLiteral = 30;		// integer
		int octal = 036;			// 8진수(octal)
		int hexa = 0x1E;			// 16진수(hexadecimal)
		System.out.println(intLiteral);
		System.out.println(octal);
		System.out.println(hexa);
		System.out.printf("%d, %d, %d%n", intLiteral, octal, hexa);
		
		double doubleLiteral = 3.14159;		// floating point(실수)
		char charLiteral = 'a';		// single quote(문자, 글자 1개)
		String strLiteral = "A quick brown fox";	// 문자열
		boolean boolLiteral = true;		// true, false
		
		if (result > 100) {
			int score1 = 30;
			System.out.println(score1);
		}
//		System.out.println(score1);		// score1 변수는 if block 밖에서는 사용할 수 없음
	}

}