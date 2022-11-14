package ch11.sec11_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 비교하려는 Object가 Comparable 인터페이스를 구현한 경우
 */
public class Ex04_ObjectSort {

	public static void main(String[] args) {
		Ex04_Member member1 = new Ex04_Member(0, "박자바");
		Ex04_Member member2 = new Ex04_Member(1, "이자바");
		Ex04_Member member3 = new Ex04_Member(2, "김자바");
		Ex04_Member[] members = {member1, member2, member3};
		
		Arrays.sort(members);				// 오름 차순
		for (Ex04_Member member : members)
			System.out.println(member);
		
		Arrays.sort(members, Comparator.reverseOrder());	// 내림 차순
		for (Ex04_Member member : members)
			System.out.println(member);
	}

}
