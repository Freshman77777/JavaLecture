package ch15_collection.sec04_hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex02_BoardHashMap {

	public static void main(String[] args) {
		Map<Integer, Board> map = new HashMap<>();
		
		for (int i = 1; i <= 5; i++)
			map.put(100+i, new Board("제목"+i, "내용"+i, "글쓴이"+i));
//		map.forEach((k, v) -> System.out.println(k + " : " + v));
//		Set<Integer> keySet = map.keySet();
		for (int key: map.keySet())
			System.out.println(key + " : " + map.get(key));
		System.out.println();
		
		// 객체 삭제
		map.remove(103);		// key 값이 103인 객체를 삭제
		map.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}