package ch05;

public class Ex01_Null {

	public static void main(String[] args) {
		String s = null;		// null 은 참조형 변수에만 사용 가능
		int[] intArray = null;
//		int a = null;			// 기본 타입에는 사용할 수 없음
		
//		System.out.println(s.length());		// NullPointerException
//		intArray[0] = 5;					// NullPointerException
		
		String s0 = "";
		System.out.println(s0.length());
	}

}