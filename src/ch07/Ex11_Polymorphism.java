package ch07;

/**
 * 다형성(Polymorphism)
 */
public class Ex11_Polymorphism {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		parent = child1;	// 자동 변환 (자식은 부모의 타입으로 자동으로 변환 가능)
		parent = child2;
		parent = new Child1();
	}

}

class Parent {
	
}

class Child1 extends Parent {
	
}

class Child2 extends Parent {
	
}