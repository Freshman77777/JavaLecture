package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex15_Grouping {

	public static void main(String[] args) {
		List<Ex15_Student> totalList = new ArrayList<>();
		totalList.add(new Ex15_Student("ȫ�浿", "��", 92));
		totalList.add(new Ex15_Student("�����", "��", 87));
		totalList.add(new Ex15_Student("���ڹ�", "��", 93));
		totalList.add(new Ex15_Student("���ؿ�", "��", 95));
		
		// �л� -> ���л� ��, ���л� ��
		Map<String, List<Ex15_Student>> map = totalList.stream()
				.collect(Collectors.groupingBy(st -> st.getGender()));
		
		List<Ex15_Student> maleList = map.get("��");
		maleList.forEach(st -> System.out.println(st.getName()));
		System.out.println();
		
		List<Ex15_Student> femaleList = map.get("��");
		femaleList.forEach(st -> System.out.println(st.getName()));
		System.out.println();
		
		// ���л�, ���л� ���
		Map<String, Double> scoreMap = totalList.stream()
				.collect(
						Collectors.groupingBy(
								st -> st.getGender(), 
								Collectors.averagingDouble(st -> st.getScore())
						)
				);
		scoreMap.forEach((k, v) -> System.out.println(k + ": " + v));
	}

}
