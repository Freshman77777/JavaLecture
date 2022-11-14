package ch10;

/**
 * 예외 처리
 */
public class Ex05_TryCatch {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("매개변수가 부족합니다.");
			System.out.println("사용법: 매개변수로 값 2개를 적으세요.");
		}
		
		int value1 = 0, value2 = 0;
		try {
			value1 = Integer.parseInt(data1);
			value2 = Integer.parseInt(data2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("잘못된 숫자입니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println(value1 + value2);
	}

}
