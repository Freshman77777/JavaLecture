package ch04;

import java.util.Random;
import java.util.Scanner;

/*
 * FizzBuzz ����
 * 
 * 3�� ��� - Fizz ���
 * 5�� ��� - Buzz ���
 * 3�� 5�� ��� - FizzBuzz ���
 * �ƴϸ� - ���� ���
 */
public class Ex05_FizzBuzz {

	public static void main(String[] args) {
		// ������ �������� ����
		Random ran = new Random();		// ��ü ����
		int number = ran.nextInt(100) + 1;	// 1 ~ 100 ���� ������ ������ ����
		
		System.out.print("1���� 100������ ������ �Է��ϼ���.> ");
		Scanner scan = new Scanner(System.in);		// ��ü ����
		int num = scan.nextInt();
		number = num;
		scan.close();
		
		if (number % 15 == 0)		// if (number % 3 == 0 && number % 5 == 0)
			System.out.println(number + ", FizzBuzz");
		else if (number % 3 == 0)
			System.out.println(number + ", Fizz");
		else if (number % 5 == 0)
			System.out.println(number + ", Buzz");
		else
			System.out.println(number + ", " + number);
	}

}