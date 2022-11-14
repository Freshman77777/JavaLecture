package ch11;

import java.text.MessageFormat;

public class Ex17_MessageFormat {

	public static void main(String[] args) {
		String id = "admin";
		String name = "������";
		String tel = "010-2345-6789";
		
		String text = "ȸ�� ID: {0} \nȸ���̸�: {1}\n��ȭ��ȣ: {2}";
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);
		
		String sql = "INSERT INTO member VALUES({0}, {1}, {2})";
		Object[] arguments = {"admin", "������", "010-2345-6789"};
		result = MessageFormat.format(sql, arguments);
		System.out.println(result);
	}

}
