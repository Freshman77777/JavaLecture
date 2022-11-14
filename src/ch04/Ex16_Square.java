package ch04;

import java.util.Scanner;

/**
 * 제곱의 합, 합의 제곱 구하기
 */
public class Ex16_Square {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("10보다 큰 정수를 입력하세요.> ");
			num = scan.nextInt();
		} while (num <= 10);
		scan.close();

		int sum = 0, sumOfSquare = 0;
		for (int i=1; i <= num; i++) {
			sum += i;				// 합
			sumOfSquare += i * i;	// 제곱의 합
		}
		int squareOfSum = sum * sum;
		System.out.println("제곱의 합: " + sumOfSquare);
		System.out.println("합의 제곱: " + squareOfSum);
	}

}