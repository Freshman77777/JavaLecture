package ch11.sec11_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ���Ϸ��� Object�� Comparable �������̽��� ������ ���
 */
public class Ex04_ObjectSort {

	public static void main(String[] args) {
		Ex04_Member member1 = new Ex04_Member(0, "���ڹ�");
		Ex04_Member member2 = new Ex04_Member(1, "���ڹ�");
		Ex04_Member member3 = new Ex04_Member(2, "���ڹ�");
		Ex04_Member[] members = {member1, member2, member3};
		
		Arrays.sort(members);				// ���� ����
		for (Ex04_Member member : members)
			System.out.println(member);
		
		Arrays.sort(members, Comparator.reverseOrder());	// ���� ����
		for (Ex04_Member member : members)
			System.out.println(member);
	}

}
