package ch08.ex13_defaultMethod;

/*
 * 최초에 method1()을 만들고,
 * 나중에 method2()를 만들고 싶을 경우
 */
public interface MyInterface {
	abstract void method1();
	
	public default void method2() {
		System.out.println("MyInterface - method2()");
	}
}
