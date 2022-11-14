package ch10;

/**
 * ArrayIndexOutOfBoundsException
 */
public class Ex02_ArrayIndex {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		
		if (args.length == 2) {
			System.out.println(args[0]);
			System.out.println(args[1]);
		} else {
			System.out.println("사용법: 매개변수로 값 2개를 적으세요.");
		}
	}

}
