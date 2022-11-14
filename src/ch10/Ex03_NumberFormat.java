package ch10;

/**
 * NumberFormatException
 */
public class Ex03_NumberFormat {

	public static void main(String[] args) {
		int value = Integer.parseInt("100원");
		// 해결하려면 정규표현식을 사용하여 숫자 이외의 문자는 다 삭제하면 됨.
		System.out.println(value);
	}

}
