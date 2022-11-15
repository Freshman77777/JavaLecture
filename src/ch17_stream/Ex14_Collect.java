package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex14_Collect {

	public static void main(String[] args) {
		List<Ex14_Student> totalList = new ArrayList<>();
		totalList.add(new Ex14_Student("ȫ�浿", "��", 92));
		totalList.add(new Ex14_Student("�����", "��", 87));
		totalList.add(new Ex14_Student("���ڹ�", "��", 93));
		totalList.add(new Ex14_Student("���ؿ�", "��", 95));
		
		// ���л� List
		List<Ex14_Student> maleList = totalList.stream()
										.filter(st -> st.getGender().equals("��"))
										.collect(Collectors.toList());
		maleList.forEach(st -> System.out.println(st.getName()));
		
		maleList = totalList.stream()
					.filter(st -> st.getGender().equals("��"))
					.collect(Collectors.toList());
		maleList.forEach(st -> System.out.println(st.getName()));
		
		// �л� -> Map<�̸�, ����>
		Map<String, Integer> map = totalList.stream()
							.collect(
									Collectors.toMap(
											st -> st.getName(),
											st -> st.getScore()
									)
							);
		map.forEach((k, v) -> System.out.println(k + ": " + v));
	}

}
