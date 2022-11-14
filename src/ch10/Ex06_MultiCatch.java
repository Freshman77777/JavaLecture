package ch10;

public class Ex06_MultiCatch {

	public static void main(String[] args) {
		String data1 = null, data2 = null;
		int value1 = 0, value2 = 0;
		
		try {
			data1 = args[0];
			data2 = args[1];
			value1 = Integer.parseInt(data1);
			value2 = Integer.parseInt(data2);
			System.out.println(value1 + value2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�Ű������� �����մϴ�.");
			System.out.println("����: �Ű������� �� 2���� ��������.");
		} catch (NumberFormatException e) {
			System.out.println("�߸��� �����Դϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
