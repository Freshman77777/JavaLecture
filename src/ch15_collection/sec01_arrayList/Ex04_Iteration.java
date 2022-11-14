package ch15_collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List�� ����� �� �ִ� �ݺ���
 */
public class Ex04_Iteration {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		for (int i=1; i<=5; i++)
			list.add(new Board("����"+i, "����"+i, "�۾���"+i));
		
		// �������� for �ݺ���
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		// Enhanced-for loop
		for (Board b: list)
			System.out.println(b);
		System.out.println();
		
		// Iteration ��ü ��� - Java ������ ���
		Iterator<Board> iter = list.iterator();
		while (iter.hasNext()) {
			Board b = iter.next();
			System.out.println(b);
		}
		System.out.println();
		
		// forEach - Lambda �� ���
		list.forEach(b -> System.out.println(b));
		list.forEach(b -> System.out.println(b.getSubject()));
	}

}