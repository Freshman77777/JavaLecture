package ch05;

public class Ex02_String {

	public static void main(String[] args) {
		String s1 = "ȫ�浿";	// ���ͷ��� �ۼ��� "ȫ�浿"�� �������� ����
		String s2 = "ȫ�浿";
		System.out.println(s1 == s2);	// true, ������ �����Ҹ� ����Ŵ
		
		String s3 = new String("ȫ�浿");	// �����ڷ� ���� "ȫ�浿"�� �ٸ� ��ҿ� ������
		String s4 = new String("ȫ�浿");
		System.out.println(s3 == s4); 	// false, �ٸ� �����Ҹ� ����Ŵ
		
		// ���� �������� ��� ��쿡�� equals() method�� ���
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}