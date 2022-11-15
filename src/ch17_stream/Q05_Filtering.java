package ch17_stream;

import java.util.Arrays;
import java.util.List;

public class Q05_Filtering {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
			);
		boolean b = "This is a java book".toLowerCase().indexOf("java") >= 0;
		System.out.println(b);
		
		list.stream()
			.filter(a -> a.toLowerCase().indexOf("java") >= 0)
//			.filter(a -> a.toLowerCase().contains("java"))
			.forEach(a -> System.out.println(a));
	}

}
