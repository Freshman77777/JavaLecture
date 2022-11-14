package ch09;

/**
 * 중첩(Nested) 클래스
 */
public class A {		// 외부 클래스
	A() { System.out.println("A 객체가 생성됨."); }

	/* 인스턴스 멤버 클래스 */
	class B {
		B() { System.out.println("B 객체가 생성됨."); }
		int field1;
		void method1() {}
	}
	
	/* 정적 멤버 클래스 */
	static class C {
		C() { System.out.println("C 객체가 생성됨."); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		/* 로컬 클래스 */
		class D {
			D() { System.out.println("D 객체가 생성됨."); }
			int field1;
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
