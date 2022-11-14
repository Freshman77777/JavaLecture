package ch08.ex12_inheritance;

public class Misc extends Parent implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("methodB()");
	}

	@Override
	public void methodC() {
		System.out.println("methodC()");
	}
}
