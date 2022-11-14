package ch08.ex13_defaultMethod;

/**
 * 새롭게 MyInterface를 구현한 클래스
 */
public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB - method1()");
	}

	@Override
	public void method2() {
		System.out.println("MyClassB - method2()");
	}
}
