package ch06;

public class Ex17_MyArray {
	private int numPerLine;

	public Ex17_MyArray(int numPerLine) {
		this.numPerLine = numPerLine;
	}
	public int getNumPerLine() {
		return numPerLine;
	}
	public void setNumPerLine(int numPerLine) {
		this.numPerLine = numPerLine;
	}
	
	double getAvg(int[] arr) {
		int sum = 0;
		for (int a: arr)
			sum += a;
		return (double)sum / arr.length;
	}
	int getMin(int[] arr) {
		int min = arr[0];
		for (int element : arr)
			if (min > element)
				min = element;
		return min;
	}
	int getMax(int[] arr) {
		int max = arr[0];
		for (int a: arr)
			if (max < a)
				max = a;
		return max;
	}
	void printArray(int[] arr) {		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d", arr[i]);
			if ((i + 1) % numPerLine == 0 || (i + 1) == arr.length)
				System.out.println();
		}
	}
	int getSumOfSquare(int[] arr) {
		int sos = 0;
		for (int a: arr)
			sos += a * a;
		return sos;
	}
}
