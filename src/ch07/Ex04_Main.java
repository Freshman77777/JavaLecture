package ch07;

public class Ex04_Main {

	public static void main(String[] args) {
		Ex04_Student student = new Ex04_Student("ȫ�浿", "����", 30, "��ǻ��");
		System.out.println(student);
		
		student.eat();
		student.study();
		student.sleep();
	}

}