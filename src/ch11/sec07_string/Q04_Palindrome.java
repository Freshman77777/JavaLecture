package ch11.sec07_string;

public class Q04_Palindrome {

	public static void main(String[] args) {
		int max = 0, x = 0, y = 0;
		for (int i = 100; i <= 999; i++) {
			for (int k = i; k <= 999; k++) {
				int mul = i * k;
				if (Strings.isPalindrome(String.valueOf(mul)) && mul > max) {
					max = mul;
					x = i;
					y = k;
				}
			}
		}
		System.out.println(x + " x " + y + " = " + max);
	}

}
