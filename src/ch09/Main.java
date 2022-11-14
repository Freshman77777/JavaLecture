package ch09;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 5;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 7;
		c.field2 = 9;
		c.method1();
		c.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
