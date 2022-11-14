package ch07;

public class Ex04_Main {

	public static void main(String[] args) {
		Ex04_Student student = new Ex04_Student("홍길동", "남자", 30, "컴퓨터");
		System.out.println(student);
		
		student.eat();
		student.study();
		student.sleep();
	}

}
