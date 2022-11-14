package ch15_collection.sec07_treeMap;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * TreeMap 일반적 사용법
 */
public class Ex01_TreeMap {

	public static void main(String[] args) {
		// key(String type) 값 오름차순
		TreeMap<String, Integer> tm = new TreeMap<>();
		// key(String type) 값 내림차순
//		TreeMap<String, Integer> tm = new TreeMap<>(Comparator.reverseOrder());
		
		tm.put("apple", 20);
		tm.put("forever", 60);
		tm.put("description", 70);
		tm.put("ever", 50);
		tm.put("zoo", 10);
		tm.put("base", 80);
		tm.put("guess", 40);
		tm.put("cherry", 30);
		
		// 정렬된 엔트리 가져오기
//		for (Entry<String, Integer> entry: tm.entrySet())
//			System.out.println(entry.getKey() + "-" + entry.getValue());
		tm.forEach((k, v) -> System.out.println(k + "-" + v));
		System.out.println();
		
		// 특정 키에 대한 값 가져오기
		Entry<String, Integer> entry = tm.firstEntry();
		System.out.println("제일 앞 단어: " + entry.getKey() + "-" + entry.getValue());
		entry = tm.lastEntry();
		System.out.println("제일 뒤 단어: " + entry.getKey() + "-" + entry.getValue());
		entry = tm.lowerEntry("ever");
		System.out.println("ever 앞 단어: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		
		// 범위 검색
		System.out.println("[c~g) 사이의 단어 검색");
		NavigableMap<String, Integer> rangeMap = tm.subMap("c", true, "g", false);
		rangeMap.forEach((k, v) -> System.out.println(k + "-" + v));
	}
}
