package ch05;

/**
 * Çâ»óµÈ For (Enhanced-for)
 */
public class Ex16_EnhancedFor {

	public static void main(String[] args) {
		String[] fruits = {"Apple", "Banana", "Cherry"};
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		int[] score = {82, 78, 90, 84, 76};
		int sum = 0;
		for (int element : score)
			sum += element;
		System.out.println((double)sum / score.length);
	}

}