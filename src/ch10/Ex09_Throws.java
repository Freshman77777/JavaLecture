package ch10;

/**
 * throws - ���ܸ� ȣ���� ������ �� �ѱ��
 */
public class Ex09_Throws {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
