package ch17_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q07_Collect {

	public static void main(String[] args) {
		List<Q07_Member> list = Arrays.asList(
				new Q07_Member("홍길동", "개발자"),
				new Q07_Member("김나리", "디자이너"),
				new Q07_Member("신용권", "개발자")
			);
			
			List<Q07_Member> developers = list.stream()
				.filter(m -> m.getJob().equals("개발자"))
				.collect(Collectors.toList());
			
			developers
//				.stream()
				.forEach(m -> System.out.println(m.getName()));
	}

}