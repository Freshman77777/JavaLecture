package ch17_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q07_Collect {

	public static void main(String[] args) {
		List<Q07_Member> list = Arrays.asList(
				new Q07_Member("ȫ�浿", "������"),
				new Q07_Member("�質��", "�����̳�"),
				new Q07_Member("�ſ��", "������")
			);
			
			List<Q07_Member> developers = list.stream()
				.filter(m -> m.getJob().equals("������"))
				.collect(Collectors.toList());
			
			developers
//				.stream()
				.forEach(m -> System.out.println(m.getName()));
	}

}