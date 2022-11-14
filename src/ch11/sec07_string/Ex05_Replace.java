package ch11.sec07_string;

public class Ex05_Replace {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어이고, 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
