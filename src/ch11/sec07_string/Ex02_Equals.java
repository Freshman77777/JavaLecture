package ch11.sec07_string;

public class Ex02_Equals {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = new String("ȫ�浿");
		
		if (str1 == str2)		// �����ϴ� �ּҰ� �����ĸ� ��
			System.out.println("���� ��Ʈ�� ��ü�� ����");
		else
			System.out.println("�ٸ� ��Ʈ�� ��ü�� ����");
		
		if (str1.equals(str2))	// ���ڿ��� �� ����� ����ؾ� ��
			System.out.println("���ڿ��� ����");
		else
			System.out.println("���ڿ��� �ٸ�");
	}

}
