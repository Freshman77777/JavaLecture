package ch11.sec04_objects;

import java.util.Objects;

public class Ex01_CompareMain {

	public static void main(String[] args) {
		Student s1 = new Student(1, "김자바");
		Student s2 = new Student(2, "박자바");
		Student s3 = new Student(3, "홍자바");
		Student s4 = new Student(2, "이자바");
		
		StudentComparator comp = new StudentComparator();
		int s1s2 = Objects.compare(s1, s2, comp);
		System.out.println(s1s2);
		int s3s1 = Objects.compare(s3, s1, comp);
		System.out.println(s3s1);
		
		int s2s4 = Objects.compare(s2, s4, comp);
		System.out.println(s2s4);
	}

}
