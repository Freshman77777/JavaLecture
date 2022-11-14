package ch04;

import java.util.Scanner;

public class Ex13_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while (sum < 100) {
			System.out.print("정수 입력> ");
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println(sum);
		
		// 의도적으로 무한 루프를 만들고 탈출 조건을 루프안에서 만들어 줌
		sum = 0;
		while (true) {
			System.out.print("정수 입력> ");
			int num = scan.nextInt();
			sum += num;
			if (sum >= 100)
				break;
		}
		System.out.println(sum);
		scan.close();
	}

}