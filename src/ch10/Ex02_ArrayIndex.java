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
			System.out.println("����: �Ű������� �� 2���� ��������.");
		}
	}

}
