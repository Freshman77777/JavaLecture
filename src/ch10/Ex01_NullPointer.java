package ch10;

/**
 * NullPointerException
 */
public class Ex01_NullPointer {

	public static void main(String[] args) {
		String str = null;
		
//		System.out.println(str.length());
		
		if (str != null)
			System.out.println(str.length());
	}
}
