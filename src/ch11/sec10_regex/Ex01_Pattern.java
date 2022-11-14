package ch11.sec10_regex;

import java.util.regex.Pattern;

public class Ex01_Pattern {

	public static void main(String[] args) {
		String regExp = "(010|02)-\\d{3,4}-\\d{4}";		// 이동/서울 전화번호
		String data1 = "02-2345-6789";
		String data2 = "010-234-9876";
		boolean result1 = Pattern.matches(regExp, data1);
		boolean result2 = Pattern.matches(regExp, data2);
		System.out.println(result1 + ", " + result2);
		
		regExp = "(\\w|\\.)+@\\w+\\.\\w+(\\.\\w+)?";	// e-mail
		data1 = "ckiekim@naver.com";
		data2 = "ck.kim@naver.co.kr";
		result1 = Pattern.matches(regExp, data1);
		result2 = Pattern.matches(regExp, data2);
		System.out.println(result1 + ", " + result2);
		
		regExp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";	// 최소 8 자, 최소 하나의 문자 및 하나의 숫자
		data1 = "abc45fgh";
		data2 = "123asd678";
		result1 = Pattern.matches(regExp, data1);
		result2 = Pattern.matches(regExp, data2);
		System.out.println(result1 + ", " + result2);
	}

}
