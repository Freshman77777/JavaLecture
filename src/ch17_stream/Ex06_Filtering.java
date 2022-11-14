package ch17_stream;

import java.util.ArrayList;
import java.util.List;

public class Ex06_Filtering {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ȫ�浿"); list.add("�ſ��"); list.add("�Ź�ö");
		list.add("���ڹ�"); list.add("�ſ��");
		
		// �ߺ���� ����
		list.stream()
			.distinct()
			.forEach(s -> System.out.println(s));
		 System.out.println();
		
		// ������ �����ϴ� ��Ҹ� ���
		list.stream()
			.filter(s -> s.startsWith("��"))
			.forEach(s -> System.out.println(s));
		System.out.println();
		
		// �ߺ���Ҹ� �����ϰ� ������ �����ϴ� ��Ҹ� ���
		list.stream()
			.distinct()
			.filter(s -> s.startsWith("��"))
			.forEach(s -> System.out.println(s));
	}

}

