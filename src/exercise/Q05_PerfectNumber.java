package exercise;

/**
 * �ڱ� �ڽ��� ������ ��� ���� ������� ���� �ڱ� �ڽ��� �Ǵ� �ڿ����� 
 * ��������� �Ѵ�. ���� ���, 6�� 28�� �������̴�. 
 *	6=1+2+3 // 1,2,3�� ���� 6�� ��� 
 *	28=1+2+4+7+14 // 1,2,4,7,14�� ���� 28�� ���
 * 10000 �̸��� �������� ��� 4���� �ִ�. �� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Q05_PerfectNumber {

	public static void main(String[] args) {
		for (int i = 2; i < 10000; i++) {
			if (isPerfectNumber(i))
				System.out.println(i);
		}
		
		for (int i = 2; i < 10000; i++) {
			int sumOfDivisors = 0;
			for (int k = 1; k < i; k++) {
				if (i % k == 0)
					sumOfDivisors += k;
			}
			if (i == sumOfDivisors)
				System.out.println(i);
		}
	}

	static boolean isPerfectNumber(int num) {
		int sumOfDivisors = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)				// i�� num�� ���
				sumOfDivisors += i;
		}
		return num == sumOfDivisors;
	}
}