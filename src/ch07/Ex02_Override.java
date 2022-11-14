package ch07;

public class Ex02_Override {

	public static void main(String[] args) {
		Ex02_Parent parent = new Ex02_Parent();
		parent.parentInt = 10;
		parent.parentMethod();		// Parent: 10
		
		Ex02_Child child = new Ex02_Child();
		child.childInt = 200;
		child.parentInt = 300;
		child.parentMethod();		// Child: 300
		
		child.childMethod();		// Parent: 300
									// Child: 200
	}

}
