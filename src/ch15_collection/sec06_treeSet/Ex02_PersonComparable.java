package ch15_collection.sec06_treeSet;

import java.util.TreeSet;

public class Ex02_PersonComparable {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		// ��ü ����
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("���ڹ�", 32));
		treeSet.add(new Person("���ڹ�", 32));
		
		for (Person p: treeSet)
			System.out.println(p.name + ": " + p.age);
	}

}