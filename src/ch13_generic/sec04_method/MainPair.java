package ch13_generic.sec04_method;

public class MainPair {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "»ç°ú");
		Pair<Integer, String> p2 = new Pair<>(1, "»ç°ú");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		System.out.println(result1);
		
		Pair<String, String> p3 = new Pair<>("user1", "È«±æµ¿");
		Pair<String, String> p4 = new Pair<>("user2", "È«±æµ¿");
		boolean result2 = Util.compare(p3, p4);
		System.out.println(result2);
	}

}
