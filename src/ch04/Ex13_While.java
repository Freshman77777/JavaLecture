package ch04;

import java.util.Scanner;

public class Ex13_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while (sum < 100) {
			System.out.print("���� �Է�> ");
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println(sum);
		
		// �ǵ������� ���� ������ ����� Ż�� ������ �����ȿ��� ����� ��
		sum = 0;
		while (true) {
			System.out.print("���� �Է�> ");
			int num = scan.nextInt();
			sum += num;
			if (sum >= 100)
				break;
		}
		System.out.println(sum);
		scan.close();
	}

}