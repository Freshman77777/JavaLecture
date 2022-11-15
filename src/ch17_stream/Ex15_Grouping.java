package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex15_Grouping {

	public static void main(String[] args) {
		List<Ex15_Student> totalList = new ArrayList<>();
		totalList.add(new Ex15_Student("홍길동", "남", 92));
		totalList.add(new Ex15_Student("김수영", "여", 87));
		totalList.add(new Ex15_Student("김자바", "남", 93));
		totalList.add(new Ex15_Student("오해영", "여", 95));
		
		// 학생 -> 남학생 맵, 여학생 맵
		Map<String, List<Ex15_Student>> map = totalList.stream()
				.collect(Collectors.groupingBy(st -> st.getGender()));
		
		List<Ex15_Student> maleList = map.get("남");
		maleList.forEach(st -> System.out.println(st.getName()));
		System.out.println();
		
		List<Ex15_Student> femaleList = map.get("여");
		femaleList.forEach(st -> System.out.println(st.getName()));
		System.out.println();
		
		// 남학생, 여학생 평균
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
