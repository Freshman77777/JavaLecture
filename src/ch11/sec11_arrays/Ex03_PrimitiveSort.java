package ch11.sec11_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03_PrimitiveSort {

	public static void main(String[] args) {
		int[] scores = {78, 89, 95, 65};
		Arrays.sort(scores);			// ���� �������� ����, �ڱ� �ı���(scores�� �ٲ����)
		System.out.println(Arrays.toString(scores));
		
		String[] fruits = "�� �� ��� ����".split(" ");
		Arrays.sort(fruits);			// ���� ����(������)
		System.out.println(Arrays.toString(fruits));
		
		Arrays.sort(fruits, Comparator.reverseOrder());		// ���� ����
		System.out.println(Arrays.toString(fruits));
	}

}
