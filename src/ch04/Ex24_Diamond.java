package ch04;

import java.util.Scanner;

/**
 * ���̾Ƹ�� �׸���
 */
public class Ex24_Diamond {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("10���� ���� Ȧ���� �Է��ϼ���.> ");
			num = scan.nextInt();
		} while (num >= 10 || num % 2 == 0);
		scan.close();
		
		int half = num / 2;		// num�� 9�̸� half�� 4
		for (int i = 1; i <= half + 1; i++) {
			for (int k = 1; k <= half - i + 1; k++)
				System.out.print(" ");
			for (int k = 1; k <= 2 * i - 1; k++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i <= half; i++) {
			for (int k = 1; k <= i; k++)
				System.out.print(" ");
			for (int k = 1; k <= 2 * (half - i) + 1; k++)	
				System.out.print("*");
			System.out.println();
		}
	}

}