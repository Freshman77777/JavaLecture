package ch11.sec07_string;

/**
 * 숫자값을 보려하지 말고, 부호만 봐라
 */
public class Ex10_CompareTo {

	public static void main(String[] args) {
		String str1 = "Apple";
		String str2 = "Cherry";
		String str3 = "air";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str3));
		
		String han1 = "가나다";
		String han2 = "라마바";
		System.out.println(han1.compareTo(han2));
		System.out.println(str1.compareTo(han1));
	}
}
