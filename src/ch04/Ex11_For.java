package ch04;

import java.util.Scanner;

/**
 * For �ݺ���
 */
public class Ex11_For {

	public static void main(String[] args) {
		// 1���� 1000���� ��
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
			sum += i;
		System.out.println(sum);

		// 1���� 10���� �� (factorial)
		int product = 1;
		for (int i = 1; i <= 10; i++)
			product *= i;
		System.out.println(product);

		// ����ڰ� �Է��� ���ڿ��� 5ȸ �޾Ƽ� �ϳ��� ���ڿ��� �����
		Scanner scan = new Scanner(System.in);
		String line = "";
		for (int i = 0; i < 5; i++) { // 5ȸ �ݺ�, �ڵ� ����: Ctrl+Shift+F
			System.out.print("�Է��ϼ���> ");
			String s = scan.nextLine();
			line += s + " ";
		}
		System.out.println(line);
		scan.close();
	}

}