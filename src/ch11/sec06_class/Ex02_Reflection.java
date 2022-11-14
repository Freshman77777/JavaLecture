package ch11.sec06_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex02_Reflection {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("ch11.sec06_class.Car");
		System.out.println(clazz.getName());
		System.out.println();
		
		// 생성자 정보
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		// 메소드 정보
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	private static void printParameters(Class[] parameters) {
		for (int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < parameters.length - 1)
				System.out.print(", ");
		}
	}
}
