package ch11.sec10_regex;

import java.util.Arrays;

public class Ex02_ReplaceAll {

	public static void main(String[] args) {
		String data = "나는 Java Programming이 좋아요!!!";
		System.out.println(data.replaceAll("[A-Z]", ""));	// 대문자 제거
		System.out.println(data.replaceAll("[a-z]", ""));	// 소문자 제거
		System.out.println(data.replaceAll("[^가-힣 ]", ""));	// 한글과 공백만 남기고 모두 제거
		
		data = System.getenv("JAVA_HOME");
		System.out.println(data);
		String[] arr = data.split("\\\\");		// Pattern으로 \\을 사용해야 되기 때문
		System.out.println(Arrays.toString(arr));
	}

}
