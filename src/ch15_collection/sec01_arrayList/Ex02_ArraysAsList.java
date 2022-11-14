package ch15_collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayList에 여러개의 데이터를 쉽게 채워넣기
 */
public class Ex02_ArraysAsList {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Java", "JSP", "JDBC");
		for (String str: list1)
			System.out.println(str);
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int i: list2)
			System.out.println(i);
		System.out.println();
		
		List<String> list3 = new ArrayList<>();
		for (String str: "apple banana cherry melon".split(" "))
			list3.add(str);
		for (String str: list3)
			System.out.println(str);
	}

}