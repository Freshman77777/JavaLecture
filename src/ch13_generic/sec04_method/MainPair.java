package ch13_generic.sec04_method;

public class MainPair {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "���");
		Pair<Integer, String> p2 = new Pair<>(1, "���");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		System.out.println(result1);
		
		Pair<String, String> p3 = new Pair<>("user1", "ȫ�浿");
		Pair<String, String> p4 = new Pair<>("user2", "ȫ�浿");
		boolean result2 = Util.compare(p3, p4);
		System.out.println(result2);
	}

}
