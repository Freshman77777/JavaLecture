package ch15_collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * 공약수 구하기
 */
public class Q01_CommonDivisors {

	public static void main(String[] args) {
		List<Integer> list = getCommonDivisors(12, 24);
		for (int i : list)
			System.out.println(i);
	}

	public static List<Integer> getCommonDivisors(int a, int b) {
		List<Integer> list = new ArrayList<>();
		int min = (a < b) ? a : b;
		
		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0)
				list.add(i);
		}
		
		return list;
	}
}