package ch04;

/**
 * If ���ǹ�
 */
public class Ex01_If {

	public static void main(String[] args) {
		// ���� if
		int number = 35;
		if (number % 5 == 0) {
			System.out.println(number + "��/�� 5�� ����Դϴ�.");
		}
		if (number % 7 == 0)		// ���๮�� �Ѱ��� ��쿡�� { } ������ �� ����
			System.out.println(number + "��/�� 7�� ����Դϴ�.");

		// if - else
		if (number % 2 == 0)
			System.out.println(number + "��/�� ¦���Դϴ�.");
		else
			System.out.println(number + "��/�� Ȧ���Դϴ�.");
		
		String evenOdd;
		if (number % 2 == 0)
			evenOdd = "¦��";
		else
			evenOdd = "Ȧ��";
		System.out.println(number + "��/�� " + evenOdd + "�Դϴ�.");
		
		String evenOdd1 = "¦��";
		if (number % 2 == 1)
			evenOdd1 = "Ȧ��";
		System.out.println(number + "��/�� " + evenOdd1 + "�Դϴ�.");
		
		String evenOdd2 = (number % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(number + "��/�� " + evenOdd2 + "�Դϴ�.");
		
		// if - else if - else
		int score = 82;
		String grade;
		if (score >= 90 && score <= 100)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		System.out.println(score + " ���� " + grade + " �����Դϴ�.");
	}

}