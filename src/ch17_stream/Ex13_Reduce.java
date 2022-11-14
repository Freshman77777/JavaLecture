package ch17_stream;

import java.util.ArrayList;
import java.util.List;

public class Ex13_Reduce {

	public static void main(String[] args) {
		List<Ex13_Student> list = new ArrayList<>();
		list.add(new Ex13_Student("全辨悼", 80));
		list.add(new Ex13_Student("蜡固急", 94));
		list.add(new Ex13_Student("脚侩鼻", 90));
		
		// 规过 1
		int sum1 = list.stream()
						.mapToInt(Ex13_Student::getScore) 	// st -> st.getScore()
						.sum();
		System.out.println("规过1: " + sum1);
		
		// 规过 2
		int sum2 = list.stream()
						.filter(st -> st.getScore() % 2 == 1)
						.map(Ex13_Student::getScore)
						.reduce(0, (a, b) -> a + b);
		System.out.println("规过2: " + sum2);
	}

}