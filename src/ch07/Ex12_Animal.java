package ch07;

/**
 * ´ÙÇü¼º - Animal »ç·Ê
 */
public class Ex12_Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.catField = 3;
		
		Animal animal = cat;
		animal.animalMethod();
		Animal animal2 = new Dog();
		animal2.animalMethod();
		
//		animal.catMethod();		// »ç¿ëÇÒ ¼ö ¾øÀ½
		
		Object obj = new Animal();
		obj = new Cow();
		obj = new Dog();
	}

}

class Animal {
	int animalField;
	void animalMethod() {
		System.out.println("Animal: " + animalField);
		System.out.println("µ¿¹°ÀÌ ¼Ò¸®¸¦ ³À´Ï´Ù.");
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
		System.out.println("¾ß¿Ë~~");
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
		System.out.println("¸Û¸Û!!");
	}
}