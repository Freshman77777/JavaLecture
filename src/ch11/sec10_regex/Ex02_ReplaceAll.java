package ch11.sec10_regex;

import java.util.Arrays;

public class Ex02_ReplaceAll {

	public static void main(String[] args) {
		String data = "���� Java Programming�� ���ƿ�!!!";
		System.out.println(data.replaceAll("[A-Z]", ""));	// �빮�� ����
		System.out.println(data.replaceAll("[a-z]", ""));	// �ҹ��� ����
		System.out.println(data.replaceAll("[^��-�R ]", ""));	// �ѱ۰� ���鸸 ����� ��� ����
		
		data = System.getenv("JAVA_HOME");
		System.out.println(data);
		String[] arr = data.split("\\\\");		// Pattern���� \\�� ����ؾ� �Ǳ� ����
		System.out.println(Arrays.toString(arr));
	}

}
