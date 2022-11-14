package ch15_collection.sec03_hashSet;

import java.util.HashSet;
import java.util.Set;

public class Ex02_MemberHashSet {

	public static void main(String[] args) {
		Member member1 = new Member("ȫ�浿", 30);
		Member member2 = new Member("ȫ�浿", 30);
		System.out.println(member1.hashCode() + ", " + member2.hashCode());
		System.out.println(member1.equals(member2));
		System.out.println();
		
		Set<Member> set = new HashSet<>();
		set.add(member1);
		set.add(member2);		// �ߺ� ��ü(hashCode()�� equals())
		set.add(new Member("ȫ�浿", 31));
		set.add(new Member("ȫ�浵", 31));
		
		// ����� ��ü��
		System.out.println("����� ��ü��: " + set.size());
	}

}