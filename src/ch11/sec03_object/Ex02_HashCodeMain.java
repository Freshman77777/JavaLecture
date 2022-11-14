package ch11.sec03_object;

import java.util.HashMap;

public class Ex02_HashCodeMain {

	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<>();
		
		hashMap.put(new Key(1), "James");
		hashMap.put(new Key(2), "Maria");
		
		// 
		System.out.println(new Key(1).hashCode() + ", " + new Key(1).hashCode());
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		//
		System.out.println(new Key(1).hashCode() + ", " + new Key(1).hashCode());
		value = hashMap.get(new Key(1));
		System.out.println(value);
		System.out.println(hashMap.get(new Key(2)));
	}
}
