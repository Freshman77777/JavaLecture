package ch11.sec07_string;

public class Q02_Reverse {

	public static void main(String[] args) {
		String s1 = "Hello World!";
		String s2 = "안녕하세요?";
		
		System.out.println(reverse(s1));
		System.out.println(reverse(s2));
		
		System.out.println(isPalindrome("우영우"));
	}

	static boolean isPalindrome(String src) {
		return src.equals(reverse(src));
	}
	
	static String reverse(String src) {
		String reverseStr = "";
		int len = src.length();
		
		for (int i=1; i<=len; i++)
			reverseStr += src.charAt(len - i);
		return reverseStr;
	}
}
