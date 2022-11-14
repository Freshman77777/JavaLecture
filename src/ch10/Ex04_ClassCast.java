package ch10;

/**
 * ClassCastException
 */
public class Ex04_ClassCast {

	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		Cat cat;
		Dog dog;
//		cat = (Cat) animal1;
//		dog = (Dog) animal1;
		
		if (animal1 instanceof Cat)
			cat = (Cat) animal1;
		if (animal1 instanceof Dog)
			dog = (Dog) animal1;
	}
}

class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}