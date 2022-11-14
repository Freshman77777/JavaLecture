package ch13_generic;

public class Q03_Main {

	public static void main(String[] args) {
		Q03_Container<String, String> container1 = new Q03_Container<>();
		container1.set("홍길동", "의적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1 + ": " + job);
		
		Q03_Container<String, Integer> container2 = new Q03_Container<>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2 + ": " + age);
	}

}
