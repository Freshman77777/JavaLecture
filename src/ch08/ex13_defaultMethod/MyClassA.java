package ch08.ex13_defaultMethod;

/*
 * 기존에 MyInterface를 구현한 클래스
 */
public class MyClassA implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassA - method1()");
	}
}
