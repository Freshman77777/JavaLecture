package ch10;

/**
 * ���� ó��
 */
public class Ex05_TryCatch {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�Ű������� �����մϴ�.");
			System.out.println("����: �Ű������� �� 2���� ��������.");
		}
		
		int value1 = 0, value2 = 0;
		try {
			value1 = Integer.parseInt(data1);
			value2 = Integer.parseInt(data2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("�߸��� �����Դϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
		System.out.println(value1 + value2);
	}

}
