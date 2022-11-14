package ch04;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * �� ���� ����ϱ�
 * 
 * ��������� �Է����� �޾�, ���� ���� �� ���̸� ���ϼ���.
 */
public class Ex06_FullAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����> ");
		int bYear = scan.nextInt();
		System.out.print("����> ");
		int bMonth = scan.nextInt();
		System.out.print("����> ");
		int bDay = scan.nextInt();
		LocalDate birthDay = LocalDate.of(bYear, bMonth, bDay);
		System.out.println("�������: " + birthDay);
		scan.close();
		
		LocalDate today = LocalDate.now();
		System.out.println("���ó�¥: " + today);
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();
		
		int fullAge = 0;
		if (tMonth > bMonth)
			fullAge = tYear - bYear;
		else if (tMonth < bMonth)
			fullAge = tYear - bYear - 1;
		else {		// tMonth�� bMonth�� ���� ���
			if (tDay >= bDay)
				fullAge = tYear - bYear;
			else
				fullAge = tYear - bYear - 1;
		}
		System.out.println("�� ���̴� " + fullAge + "�� �Դϴ�.");
	}

}