package ch10;

/**
 * NumberFormatException
 */
public class Ex03_NumberFormat {

	public static void main(String[] args) {
		int value = Integer.parseInt("100��");
		// �ذ��Ϸ��� ����ǥ������ ����Ͽ� ���� �̿��� ���ڴ� �� �����ϸ� ��.
		System.out.println(value);
	}

}