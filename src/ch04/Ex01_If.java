package ch04;

/**
 * If 조건문
 */
public class Ex01_If {

	public static void main(String[] args) {
		// 단일 if
		int number = 35;
		if (number % 5 == 0) {
			System.out.println(number + "은/는 5의 배수입니다.");
		}
		if (number % 7 == 0)		// 실행문이 한개일 경우에는 { } 생략할 수 있음
			System.out.println(number + "은/는 7의 배수입니다.");

		// if - else
		if (number % 2 == 0)
			System.out.println(number + "은/는 짝수입니다.");
		else
			System.out.println(number + "은/는 홀수입니다.");
		
		String evenOdd;
		if (number % 2 == 0)
			evenOdd = "짝수";
		else
			evenOdd = "홀수";
		System.out.println(number + "은/는 " + evenOdd + "입니다.");
		
		String evenOdd1 = "짝수";
		if (number % 2 == 1)
			evenOdd1 = "홀수";
		System.out.println(number + "은/는 " + evenOdd1 + "입니다.");
		
		String evenOdd2 = (number % 2 == 0) ? "짝수" : "홀수";
		System.out.println(number + "은/는 " + evenOdd2 + "입니다.");
		
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
		System.out.println(score + " 점은 " + grade + " 학점입니다.");
	}

}