package ch04;

import java.util.Scanner;

/**
 * For 반복문
 */
public class Ex11_For {

	public static void main(String[] args) {
		// 1에서 1000까지 합
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
			sum += i;
		System.out.println(sum);

		// 1에서 10까지 곱 (factorial)
		int product = 1;
		for (int i = 1; i <= 10; i++)
			product *= i;
		System.out.println(product);

		// 사용자가 입력한 문자열을 5회 받아서 하나의 문자열로 만들기
		Scanner scan = new Scanner(System.in);
		String line = "";
		for (int i = 0; i < 5; i++) { // 5회 반복, 자동 정렬: Ctrl+Shift+F
			System.out.print("입력하세요> ");
			String s = scan.nextLine();
			line += s + " ";
		}
		System.out.println(line);
		scan.close();
	}

}