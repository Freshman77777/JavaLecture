package ch11.sec04_objects;

public class Ex02_HashMain {

	public static void main(String[] args) {
		Student s1 = new Student(1, "���ڹ�");
		Student s2 = new Student(2, "���ڹ�");
		Student s3 = new Student(3, "ȫ�ڹ�");
		Student s4 = new Student(2, "���ڹ�");
		
		System.out.println(s1.hashCode() + ", " + s2.hashCode());
		System.out.println(s3.hashCode() + ", " + s4.hashCode());
	}

}
