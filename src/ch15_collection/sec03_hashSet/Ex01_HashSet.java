package ch15_collection.sec03_hashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet 기본 사용법
 */
public class Ex01_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// 객체 저장
		set.add("Java");
		set.add("JSP");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java");		// 중복 객체이므로 저장되지 않음
		
		// 저장된 객체 수
		System.out.println("저장된 객체 수: " + set.size());
		System.out.println();
		
		// 전체 출력
		for (String str: set)
			System.out.println(str);
		System.out.println();
		set.forEach(s -> System.out.println(s));
		System.out.println();
		
		// 객체 삭제
		set.remove("JSP");
		System.out.println("저장된 객체 수: " + set.size());
		System.out.println();
		
		set.removeIf(s -> s.length() > 6);			// filtering
		set.forEach(s -> System.out.println(s));
	}

}