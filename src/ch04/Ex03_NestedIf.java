package ch04;

/**
 * ��ø(Nested) If
 */
public class Ex03_NestedIf {

	public static void main(String[] args) {
		int score = 88;
		String grade;
		if (score > 90) {
			if (score >= 97)
				grade = "A+";
			else if (score >= 94)
				grade = "A0";
			else
				grade = "A-";
		} else if (score > 80) {
			if (score > 87)
				grade = "B+";
			else if (score >=84) 
				grade = "B0";
			else
				grade = "B-";
		} else {
			grade = "C";
		}
		System.out.println(score + "���� " + grade + " �����Դϴ�.");
	}

}