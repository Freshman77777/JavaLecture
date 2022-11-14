package ch06;

public class Ex17_Main {

	public static void main(String[] args) {
		Ex17_MyArray myArray = new Ex17_MyArray(4);
		int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		myArray.printArray(intArray);		// numPerLine = 4
		myArray.setNumPerLine(5);
		myArray.printArray(intArray);		// numPerLine = 5
		
		System.out.println(myArray.getMin(intArray));
		System.out.println(myArray.getMax(intArray));
		System.out.println(myArray.getAvg(intArray));
		System.out.println(myArray.getSumOfSquare(intArray));
		
		// intArray 의 분산 = E(X*X) - E(X)*E(X)
		double var = myArray.getSumOfSquare(intArray) / intArray.length -
					 myArray.getAvg(intArray) * myArray.getAvg(intArray);
		double std = Math.sqrt(var);
		System.out.println("평균: " + myArray.getAvg(intArray));
		System.out.println("분산: " + var);
		System.out.println("표준편차: " + std);
	}

}
