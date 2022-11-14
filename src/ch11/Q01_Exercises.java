package ch11;

import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Objects;

public class Q01_Exercises {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// 문제 5
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));
		System.out.println(hashSet.size());
		for (Student st: hashSet)
			System.out.println(st.hashCode());

		// 문제 6
		Member member = new Member("blue", "이파란");
		System.out.println(member);
		
		// 문제 8
		long startTime = System.nanoTime();
		int[] scores = new int[1000];
		for (int i=0; i<scores.length; i++) 
			scores[i] = i;
		int sum = 0;
		for (int score: scores)
			sum += score;
		double avg = (double) sum / scores.length;
		System.out.println(avg);
		long endTime = System.nanoTime();
		System.out.println("경과시간: " + (endTime-startTime) + " 나노초");
		
		// 문제 9
		byte[] bytes = {-20, -107, -120, -21, -123, -107};
		String str = new String(bytes, "UTF-8");
		System.out.println(str);
		
		// 문제 10
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<=100; i++) 
			sb.append(String.valueOf(i));
		System.out.println(sb.toString());
	}
}

class Student {
	private String studentNum;

	Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(studentNum);
//		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student))
			return false;
		Student st = (Student) obj;
		return studentNum.equals(st.getStudentNum());
	}
}

class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
}