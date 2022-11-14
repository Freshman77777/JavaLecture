package ch14_lambda;

import java.util.function.IntBinaryOperator;

public class Ex10_MethodReference {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		// 정적 메소드 참조
		operator = (x, y) -> Ex10_Calculator.staticMethod(x, y);
		System.out.println(operator.applyAsInt(3, 4));
		
		operator = Ex10_Calculator::staticMethod;
		System.out.println(operator.applyAsInt(3, 4));
		
		// 인스턴스 메소드 참조
		Ex10_Calculator calc = new Ex10_Calculator();
		operator = (x, y) -> calc.instanceMethod(x, y);
		System.out.println(operator.applyAsInt(5, 6));
		
		operator = calc::instanceMethod;
		System.out.println(operator.applyAsInt(5, 6));
	}

}
