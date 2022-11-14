package ch10;

public class Ex13_ArraySum {

	public static void main(String[] args) {
		int[] arr = {5, 14, 76, 23, 48};
		int sum = 0, index = 0;
		
		try {
			while(true) {
				sum += arr[index++];
			}
		} catch (ArrayIndexOutOfBoundsException e) {	
			System.out.println("배열의 합: " + sum);
		}
	}

}
