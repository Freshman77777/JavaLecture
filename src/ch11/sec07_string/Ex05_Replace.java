package ch11.sec07_string;

public class Ex05_Replace {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü�������̰�, �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}