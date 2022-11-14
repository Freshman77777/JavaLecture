package ch17_stream;

import java.util.ArrayList;
import java.util.List;

public class Ex06_Filtering {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동"); list.add("신용권"); list.add("신민철");
		list.add("김자바"); list.add("신용권");
		
		// 중복요소 제거
		list.stream()
			.distinct()
			.forEach(s -> System.out.println(s));
		 System.out.println();
		
		// 신으로 시작하는 요소만 통과
		list.stream()
			.filter(s -> s.startsWith("신"))
			.forEach(s -> System.out.println(s));
		System.out.println();
		
		// 중복요소를 제거하고 신으로 시작하는 요소만 통과
		list.stream()
			.distinct()
			.filter(s -> s.startsWith("신"))
			.forEach(s -> System.out.println(s));
	}

}

