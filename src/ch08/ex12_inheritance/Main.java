package ch08.ex12_inheritance;

public class Main {

	public static void main(String[] args) {
		InterfaceC ic = new ImplementClass();
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		Misc misc = new Misc();
		misc.methodA();
		misc.methodB();
		misc.methodC();
		misc.methodParent();
		
		ic = misc;		// ´ÙÇü¼º
		ic.methodA();
		ic.methodB();
		ic.methodC();
//		ic.methodParent();
	}

}
