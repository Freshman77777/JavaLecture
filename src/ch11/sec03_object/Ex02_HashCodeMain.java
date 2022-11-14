package ch11.sec03_object;

import java.util.HashMap;

public class Ex02_HashCodeMain {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체를 생성
		HashMap<Key, String> hashMap = new HashMap<>();
		
		hashMap.put(new Key(1), "James");
		hashMap.put(new Key(2), "Maria");
		
		// Key class에서 hashCode method를 재정의하기 이전
		System.out.println(new Key(1).hashCode() + ", " + new Key(1).hashCode());
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		// Key class에서 hashCode method를 재정의
		System.out.println(new Key(1).hashCode() + ", " + new Key(1).hashCode());
		value = hashMap.get(new Key(1));
		System.out.println(value);
		System.out.println(hashMap.get(new Key(2)));
	}
}
