package ch07;

/**
 * 다형성 - Animal 사례
 */
public class Ex12_Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.catField = 3;
		
		Animal animal = cat;
		animal.animalMethod();
		Animal animal2 = new Dog();
		animal2.animalMethod();
		
//		animal.catMethod();		// 사용할 수 없음
		
		Object obj = new Animal();
		obj = new Cow();
		obj = new Dog();
	}

}

class Animal {
	int animalField;
	void animalMethod() {
		System.out.println("Animal: " + animalField);
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Cat extends Animal {
	int catField;
	void catMethod() {
		System.out.println("Cat: " + catField);
	}
	@Override
	void animalMethod() {
		System.out.println("Cat: " + animalField);
		System.out.println("야옹~~");
	}
}
class Dog extends Animal {
	int dogField;
	void dogMethod() {
		System.out.println("Dog: " + dogField);
	}
	@Override
	void animalMethod() {
		System.out.println("Dog: " + animalField);
		System.out.println("멍멍!!");
	}
}