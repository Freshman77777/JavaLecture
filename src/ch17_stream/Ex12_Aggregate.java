package ch17_stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Ex12_Aggregate {

	public static void main(String[] args) {
		int[] intArr = {1, 3, 6, 2, 8};
		
		// 2�� ����� ����
		long count = Arrays.stream(intArr)
						.filter(n -> n % 2 == 0)
						.count();
		System.out.println(count);
		
		// 2�� ����� �հ�
		int sum = Arrays.stream(intArr)
					.filter(n -> n % 2 == 0)
					.sum();
		System.out.println(sum);
		
		// 2�� ����� ���
		double avg = Arrays.stream(intArr)
						.filter(n -> n % 2 == 0)
						.average()
						.getAsDouble();
		System.out.println(avg);
		
		// 2�� ����� �ִ밪
		int max = Arrays.stream(intArr)
					.filter(n -> n % 2 == 0)
					.max()			// OptionalXXX type
					.getAsInt();
		
		// Optional
		// 5�� ����� ���
//		double average = Arrays.stream(intArr)
//							.filter(n -> n % 5 == 0)
//							.average()		// NoSuchElementException �߻�
//							.getAsDouble();
		
		// �ذ���1
		OptionalDouble optional = Arrays.stream(intArr)
									.filter(n -> n % 5 == 0)
									.average();
		if (optional.isPresent())
			System.out.println("���1 ���: " + optional.getAsDouble());
		else
			System.out.println("���1 ���: 0.0");
		
		// �ذ���2
		double average = Arrays.stream(intArr)
							.filter(n -> n % 5 == 0)
							.average()
							.orElse(0.0);
		System.out.println("���2 ���: " + average);
		
		// �ذ���3 
		Arrays.stream(intArr)
			.filter(n -> n % 5 == 0)
			.average()
			.ifPresent(d -> System.out.println("���3 ���: " + d));
	}

}
