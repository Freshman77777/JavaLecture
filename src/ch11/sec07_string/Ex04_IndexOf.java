package ch11.sec07_string;

public class Ex04_IndexOf {

	public static void main(String[] args) {
		String str = "�ڹ� ���α׷���";
		
		int index = str.indexOf("���α׷���");
		System.out.println(index);
		
		// ã���� �ϴ� ���ڿ��� ��� ���ڿ��� �ִ� ��� ���� ���� 0 �̻���
		if (str.indexOf("�ڹ�") >= 0)
			System.out.println("�ڹ� ����");
		else									// -1 �� ����
			System.out.println("�ڹ� ������");
	}

}
