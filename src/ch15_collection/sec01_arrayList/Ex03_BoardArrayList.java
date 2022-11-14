package ch15_collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex03_BoardArrayList {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		// ��ü �߰�
		for (int i=1; i<=5; i++)
			list.add(new Board("����"+i, "����"+i, "�۾���"+i));
		for (Board b: list)
			System.out.println(b);
		System.out.println();
		
		// ����� �� ��ü�� Ȯ��
		int size = list.size();
		System.out.println("�� ��ü��: " + size + "\n");
		
		// Ư�� ��ü ��������
		Board board = list.get(2);
		System.out.println(board);
		System.out.println();
		
		// ��ü ����
		list.remove(3);
		for (Board b: list)
			System.out.println(b);
	}

}