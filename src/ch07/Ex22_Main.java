package ch07;

public class Ex22_Main {

	public static void main(String[] args) {
		Cow cow = new Cow();
		Cock cock = new Cock();
		cow.sound();
		cock.sound();
		System.out.println();
		
		// ������ �ڵ� Ÿ�� ��ȯ
//		Ex22_Animal animal = new Ex22_Animal();
		Ex22_Animal animal = null;
		animal = new Cow();
		animal.sound();
		animal = new Cock();
		animal.sound();
		System.out.println();
		
		// �Ű������� �ڵ� Ÿ�� ��ȯ
		animalSound(new Cow());
		animalSound(new Cock());
	}
	static void animalSound(Ex22_Animal animal) {
		animal.sound();
	}
}
