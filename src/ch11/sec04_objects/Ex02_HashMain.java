package ch11.sec04_objects;

public class Ex02_HashMain {

	public static void main(String[] args) {
		Student s1 = new Student(1, "김자바");
		Student s2 = new Student(2, "박자바");
		Student s3 = new Student(3, "홍자바");
		Student s4 = new Student(2, "이자바");
		
		System.out.println(s1.hashCode() + ", " + s2.hashCode());
		System.out.println(s3.hashCode() + ", " + s4.hashCode());
	}

}
