package ch07;

/**
 * ������ - Animal ���
 */
public class Ex12_Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.catField = 3;
		
		Animal animal = cat;
		animal.animalMethod();
		Animal animal2 = new Dog();
		animal2.animalMethod();
		
//		animal.catMethod();		// ����� �� ����
		
		Object obj = new Animal();
		obj = new Cow();
		obj = new Dog();
	}

}

class Animal {
	int animalField;
	void animalMethod() {
		System.out.println("Animal: " + animalField);
		System.out.println("������ �Ҹ��� ���ϴ�.");
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
		System.out.println("�߿�~~");
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
		System.out.println("�۸�!!");
	}
}