package exercise;

import java.util.Scanner;

/**
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 
 * 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 
 * 3만큼 밀면 "DE"가 됩니다. "Z"는 1만큼 밀면 "A"가 됩니다. 
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 프로그램을 작성하시오.
 * 제한조건은 다음과 같다.
 *	공백은 아무리 밀어도 공백입니다.
 *	s는 알파벳 대문자, 공백으로만 이루어져 있습니다.
 *	s의 길이는 80 이하입니다.
 *	n은 1 이상, 10이하인 정수입니다.
 */
public class Q06_CaesarCipher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문장 입력> ");
		String plainText = scan.nextLine();
		System.out.print("스텝> ");
		int step = scan.nextInt();
		scan.close();
		String cipherText = plain2cipher(plainText, step);
		System.out.println(cipherText);
		System.out.println(cipher2plain(cipherText, step));
	}

	/* 암호화 */
	static String plain2cipher(String text, int step) {
		char[] cipherText = new char[text.length()];
		for (int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			if (c == ' ') {
				cipherText[i] = c;
				continue;
			}
			char d = (char)(c + step);
			if (d > 'Z')
				d = (char)(d - 26);
			cipherText[i] = d;
		}
		return new String(cipherText);
	}
	/* 복호화 */
	static String cipher2plain(String text, int step) {
		char[] plainText = new char[text.length()];
		for (int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			if (c == ' ' ) {
				plainText[i] = c;
				continue;
			}
			char d = (char)(c - step);
			if (d < 'A')
				d = (char)(d + 26);
			plainText[i] = d;
		}
		return new String(plainText);
	}
}
