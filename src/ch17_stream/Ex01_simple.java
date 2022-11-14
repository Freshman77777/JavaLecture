package ch17_stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Ex01_simple {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("ȫ�浿");
		set.add("�÷���");
		set.add("���ٽ�");

		 //��Ʈ���� �̿��� ��� �ݺ� ó��
		Stream stream = set.stream();
		stream.forEach(name -> System.out.println(name));
		
		set.stream()
		.forEach(s -> System.out.println(s));
		
		
		
		set.forEach(s -> System.out.println(s));
		
	}

}
