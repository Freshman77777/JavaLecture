package ch15_collection.sec04_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap �⺻ ����
 */
public class Ex01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// ��ü ����
		map.put("���", 1000);
		map.put("��", 2000);
		map.put("���", 2500);		// key ���� �ߺ��̸�, value �� ������
		map.put("��", 800);
		System.out.println("�� ��Ʈ�� ��: " + map.size());
		
		// Ű�� �� ���
		String key = "��";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();
		
		// Ű�� Set collection
		Set<String> keySet = map.keySet();
		for (String s: keySet)
			System.out.println(s + ": " + map.get(s));
		System.out.println();
		
		// Entry�� Set collection
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry: entrySet)
			System.out.println(entry.getKey() + ": " + entry.getValue());
		System.out.println();
		
		// Iterator
		Iterator<Entry<String, Integer>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
		
		// forEach
		map.forEach((k, v) -> System.out.println(k + ": " + v));
		System.out.println();
		
		// Ű�� ��Ʈ�� ����
		map.remove("���");
		System.out.println("�� ��Ʈ�� ��: " + map.size());
		System.out.println();
		
		// Ű �˻�
		System.out.println(map.containsKey("��"));
		System.out.println(map.containsKey("���"));
		// value �˻�
		System.out.println(map.containsValue(1000));
	}
}