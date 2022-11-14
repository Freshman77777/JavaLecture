package ch17_stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Ex01_simple {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("컬렉션");
		set.add("람다식");
		
		// 스트림을 이용한 요소 반복 처리
		Stream stream = set.stream();
		stream.forEach(name -> System.out.println(name));
		
		set.stream()
		   .forEach(s -> System.out.println(s));
		
		// 컬렉션 단독으로 forEach() method 사용 가능
		set.forEach(s -> System.out.println(s));
	}

}