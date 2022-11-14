package ch13_generic;

public class Q02_Main {

	public static void main(String[] args) {
		Q02_Container<String> container1 = new Q02_Container<>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
		
		Q02_Container<Integer> container2 = new Q02_Container<>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);
	}
}
