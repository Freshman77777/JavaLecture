package ch04;

public class Ex04_Switch {

	public static void main(String[] args) {
		int score = 83;
		String grade;
		switch(score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;			// switch ����� Ż��
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:			// ������ ������ ���� �ʴ� ���
			grade = "F";
		}
		System.out.println(score + "���� " + grade + " �����Դϴ�.");
	}

}