package ch17_stream;

import java.util.stream.IntStream;

public class Ex05_Range {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10);		// [1, 10), 1 ~ 9
		stream.forEach(i -> System.out.println(i));
		
		stream = IntStream.rangeClosed(1, 10);
		stream.forEach(i -> System.out.println(i));		// [1, 10]
		
		stream = IntStream.rangeClosed(1, 100);
		stream.forEach(i -> sum += i);		// sum local 변수는 사용할 수 없음
		System.out.println("총합: " + sum);
	}

}
