package ch11.sec07_string;

import java.util.Arrays;

public class Ex11_Split {

	public static void main(String[] args) {
		String fruits = "��, ��, ��, ��";
		String[] fruitArr = fruits.split(", ");
		System.out.println(Arrays.toString(fruitArr));
		
		String fruits2 = "���, ����. ����: ����";
		String[] fruitArr2 = fruits2.split("[,|.|:] ");		// ���� ǥ����
		System.out.println(Arrays.toString(fruitArr2));
		
		String paths = System.getenv("PATH");
		System.out.println(paths);
		String[] pathArr = paths.split(";");
//		for (String path: pathArr)
//			System.out.println(path);
		String pathStr = String.join("\n", pathArr);
		System.out.println(pathStr);
	}

}
