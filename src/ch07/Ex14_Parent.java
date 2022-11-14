package ch07;

public class Ex14_Parent {
	String name = "�θ�";
	void parentMethod() {
		System.out.println("Parent: " + name);
	}
}

class Son extends Ex14_Parent {
	String sonName = "�Ƶ�";
	void sonMethod() {
		System.out.println("Son: " + sonName);
	}
	@Override
	void parentMethod() {
		System.out.println("Son: " + name);
	}
}

class Daughter extends Ex14_Parent {
	String daughterName = "��";
	void daughterMethod() {
		System.out.println("Daughter: " + daughterName);
	}
	@Override
	void parentMethod() {
		System.out.println("Daughter: " + name);
	}
}