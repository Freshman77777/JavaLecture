package ch04;

import java.util.Scanner;

/**
 * ������ ��, ���� ���� ���ϱ�
 */
public class Ex16_Square {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("10���� ū ������ �Է��ϼ���.> ");
			num = scan.nextInt();
		} while (num <= 10);
		scan.close();

		int sum = 0, sumOfSquare = 0;
		for (int i=1; i <= num; i++) {
			sum += i;				// ��
			sumOfSquare += i * i;	// ������ ��
		}
		int squareOfSum = sum * sum;
		System.out.println("������ ��: " + sumOfSquare);
		System.out.println("���� ����: " + squareOfSum);
	}

}