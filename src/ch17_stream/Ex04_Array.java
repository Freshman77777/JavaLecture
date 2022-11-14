package ch17_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_Array {

	public static void main(String[] args) {
		String[] strArray = {"È«±æµ¿","±èÀÚ¹Ù","¹Ú°´Ã¼"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(s->System.out.println(s));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.filter(i -> i > 2)
				 .peek(i -> System.out.println(i))
				 .map(i -> i * i)
				 .forEach(i -> System.out.println(i));
		
		

	}

}
