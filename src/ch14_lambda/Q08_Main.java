package ch14_lambda;

public class Q08_Main {
	private static Q08_Student[] students = {
			new Q08_Student("홍길동", 90, 96),
			new Q08_Student("김자바", 95, 93)
	};
	
	static double avg(Q08_MyFunction<Q08_Student> fun) {
		double sum = 0;
		for (Q08_Student student: students)
			sum += fun.apply(student);
		return sum / students.length;
	}
	
	public static void main(String[] args) {
		double engAvg = avg(s -> s.getEngScore());
		System.out.println(engAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println(mathAvg);
	}

}
