package ch15_collection.sec06_treeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex01_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		int[] arr = {87, 98, 75, 95, 80};
		for (int score: arr)
			scores.add(score);
		for (int score: scores)
			System.out.println(score);
		System.out.println();
		
		// Ư�� ��ü ��������
		System.out.println("���� ���� ����: " + scores.first());
		System.out.println("���� ���� ����: " + scores.last());
		System.out.println("95�� �Ʒ� ����: " + scores.lower(95));
		System.out.println("95�� �� ����: " + scores.higher(95));
		System.out.println("95���̰ų� �ٷ� �Ʒ� ����: " + scores.floor(95));
		System.out.println("85���̰ų� �ٷ� ���� ����: " + scores.ceiling(85));
		System.out.println();
		
		// ���� �������� ����
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for (int s: descendingScores)
			System.out.println(s);
		System.out.println(descendingScores.first()); 	// �������� ������ ��쿣 ���� ū ��
		System.out.println();
		
		// ���� �˻� (80 < score)
		NavigableSet<Integer> rangeSet = scores.tailSet(80, false);		// 87, 95, 98
		for (int s: rangeSet)
			System.out.println(s);
		System.out.println();
		
		// ���� �˻� (80 <= score < 90)
		rangeSet = scores.subSet(80, true, 90, false);		// 80, 87
		for (int s: rangeSet)
			System.out.println(s);
	}
}