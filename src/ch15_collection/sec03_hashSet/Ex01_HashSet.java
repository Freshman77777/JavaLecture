package ch15_collection.sec03_hashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet �⺻ ����
 */
public class Ex01_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// ��ü ����
		set.add("Java");
		set.add("JSP");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java");		// �ߺ� ��ü�̹Ƿ� ������� ����
		
		// ����� ��ü ��
		System.out.println("����� ��ü ��: " + set.size());
		System.out.println();
		
		// ��ü ���
		for (String str: set)
			System.out.println(str);
		System.out.println();
		set.forEach(s -> System.out.println(s));
		System.out.println();
		
		// ��ü ����
		set.remove("JSP");
		System.out.println("����� ��ü ��: " + set.size());
		System.out.println();
		
		set.removeIf(s -> s.length() > 6);			// filtering
		set.forEach(s -> System.out.println(s));
	}

}