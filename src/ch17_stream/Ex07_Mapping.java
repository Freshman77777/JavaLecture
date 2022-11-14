package ch17_stream;

import java.util.ArrayList;
import java.util.List;

public class Ex07_Mapping {

	public static void main(String[] args) {
		List<Ex07_Student> list = new ArrayList<>();
		list.add(new Ex07_Student("ȫ�浿", 80));
		list.add(new Ex07_Student("ȫ�浿", 90));
		list.add(new Ex07_Student("ȫ�浿", 94));
		
		list.stream()
			.mapToInt(s -> s.getScore())
			.forEach(i -> System.out.println(i));
	}

}
