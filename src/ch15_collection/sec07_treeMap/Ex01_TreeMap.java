package ch15_collection.sec07_treeMap;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * TreeMap �Ϲ��� ����
 */
public class Ex01_TreeMap {

	public static void main(String[] args) {
		// key(String type) �� ��������
		TreeMap<String, Integer> tm = new TreeMap<>();
		// key(String type) �� ��������
//		TreeMap<String, Integer> tm = new TreeMap<>(Comparator.reverseOrder());
		
		tm.put("apple", 20);
		tm.put("forever", 60);
		tm.put("description", 70);
		tm.put("ever", 50);
		tm.put("zoo", 10);
		tm.put("base", 80);
		tm.put("guess", 40);
		tm.put("cherry", 30);
		
		// ���ĵ� ��Ʈ�� ��������
//		for (Entry<String, Integer> entry: tm.entrySet())
//			System.out.println(entry.getKey() + "-" + entry.getValue());
		tm.forEach((k, v) -> System.out.println(k + "-" + v));
		System.out.println();
		
		// Ư�� Ű�� ���� �� ��������
		Entry<String, Integer> entry = tm.firstEntry();
		System.out.println("���� �� �ܾ�: " + entry.getKey() + "-" + entry.getValue());
		entry = tm.lastEntry();
		System.out.println("���� �� �ܾ�: " + entry.getKey() + "-" + entry.getValue());
		entry = tm.lowerEntry("ever");
		System.out.println("ever �� �ܾ�: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		
		// ���� �˻�
		System.out.println("[c~g) ������ �ܾ� �˻�");
		NavigableMap<String, Integer> rangeMap = tm.subMap("c", true, "g", false);
		rangeMap.forEach((k, v) -> System.out.println(k + "-" + v));
	}
}
