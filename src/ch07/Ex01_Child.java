package ch07;

public class Ex01_Child extends Ex01_Parent {
	int childInt;
	
	Ex01_Child() {}
	Ex01_Child(int childInt) {
		super(childInt * 2);
		this.childInt = childInt;
	}

	void childMethod() {
		System.out.println(childInt);
	}
}
