package ch04;

import java.util.Scanner;

/**
 *	�� ������� ���̾Ƹ�� �׸���
 */
public class Ex22_Star {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("8���� ���� ������ �Է��ϼ���.> ");
			num = scan.nextInt();
		} while (num >= 8);
		scan.close();
		
		// 1��и�
		System.out.println("1��и�");
		for (int i = 1; i <= num; i++) {	// i : 1 ~ 5
			for (int k = 1; k <= i; k++) {	// k : i �� ��ŭ
				System.out.print("*");
			}
			System.out.println();
		}
		// 4��и�
		System.out.println("4��и�");
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {	// k : i �� ��ŭ
				System.out.print("*");
			}
			System.out.println();
		}
		// 2��и�
		System.out.println("2��и�");
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= num - i; k++)	// num - i �� ��ŭ space
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
		// 3��и�
		System.out.println("3��и�");
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= num - i; k++)	// num - i �� ��ŭ space
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
	}

}