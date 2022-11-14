package ch13_generic.sec04_method;

public class MainPair {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		System.out.println(result1);
		
		Pair<String, String> p3 = new Pair<>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<>("user2", "홍길동");
		boolean result2 = Util.compare(p3, p4);
		System.out.println(result2);
	}

}
