package ch15_collection.sec03_hashSet;

import java.util.HashSet;
import java.util.Set;

public class Ex02_MemberHashSet {

	public static void main(String[] args) {
		Member member1 = new Member("全辨悼", 30);
		Member member2 = new Member("全辨悼", 30);
		System.out.println(member1.hashCode() + ", " + member2.hashCode());
		System.out.println(member1.equals(member2));
		System.out.println();
		
		Set<Member> set = new HashSet<>();
		set.add(member1);
		set.add(member2);		// 吝汗 按眉(hashCode()客 equals())
		set.add(new Member("全辨悼", 31));
		set.add(new Member("全辨档", 31));
		
		// 历厘等 按眉荐
		System.out.println("历厘等 按眉荐: " + set.size());
	}

}