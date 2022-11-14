package ch11.sec11_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03_PrimitiveSort {

	public static void main(String[] args) {
		int[] scores = {78, 89, 95, 65};
		Arrays.sort(scores);			// 오름 차순으로 정렬, 자기 파괴적(scores가 바뀌었음)
		System.out.println(Arrays.toString(scores));
		
		String[] fruits = "감 귤 사과 딸기".split(" ");
		Arrays.sort(fruits);			// 오름 차순(사전순)
		System.out.println(Arrays.toString(fruits));
		
		Arrays.sort(fruits, Comparator.reverseOrder());		// 내림 차순
		System.out.println(Arrays.toString(fruits));
	}

}
