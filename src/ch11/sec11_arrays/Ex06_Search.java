package ch11.sec11_arrays;

import java.util.Arrays;

/*
 * Binary Search 알고리즘으로 검색 결과 인덱스 값을 구함
 */
public class Ex06_Search {

	public static void main(String[] args) {
		// 기본 타입 검색
		int[] scores = {78, 84, 92, 65};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 84);
		System.out.println(index);
		
		// 문자열 검색
		String[] fruits = "귤 사과 배 딸기".split(" ");
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		index = Arrays.binarySearch(fruits, "배");
		System.out.println(index);
		
		// 객체 검색
		Ex04_Member m1 = new Ex04_Member(0, "박자바");
		Ex04_Member m2 = new Ex04_Member(1, "이자바");
		Ex04_Member m3 = new Ex04_Member(2, "김자바");
		Ex04_Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for (Ex04_Member member : members)
			System.out.println(member);
		index = Arrays.binarySearch(members, m2);
		System.out.println(index);
		
		index = Arrays.binarySearch(members, new Ex04_Member(3, "박자바"));
		System.out.println(index);
	}

}
