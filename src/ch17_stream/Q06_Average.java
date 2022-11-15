package ch17_stream;

import java.util.Arrays;
import java.util.List;

public class Q06_Average {

	public static void main(String[] args) {
		List<Q06_Member> list = Arrays.asList(
				new Q06_Member("ȫ�浿", 30),
				new Q06_Member("�ſ��", 40),
				new Q06_Member("���ڹ�", 26)
		);
		
		double avg = list.stream()
				.mapToInt(m -> m.getAge())
//				.mapToInt(Q06_Member::getAge)
				.average()
				.getAsDouble();
		
		System.out.println("��� ����: " + avg);
	}

}
