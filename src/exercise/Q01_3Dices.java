package exercise;

import java.util.Random;

/**
 * 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�. 
 * (�ֻ����� ���� Random ���� �̿��Ѵ�.)
 *   1.	���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
 *   2.	���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
 *   3.	��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
 * ���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 
 * 1,300���� �ް� �ȴ�. �� 3���� ���� 2, 2, 2�� �־����� 10,000+2��1,000���� 
 * ���Ǿ� 12,000���� �ް� �ȴ�. 3���� ���� 6, 2, 5�� �־����� 
 * �� �� ���� ū ���� 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
 * 3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Q01_3Dices {

	public static void main(String[] args) {
		Random random = new Random();
		int num1 = random.nextInt(6) + 1;
		int num2 = random.nextInt(6) + 1;
		int num3 = random.nextInt(6) + 1;
		int prize = getPrize(num1, num2, num3);
		System.out.println("�ֻ��� ��: " + num1 + ", " + num2 + ", " + num3);
		System.out.printf("���: %,d%n", prize);
		System.out.printf("���: %,d%n", getPrize2(num1, num2, num3));
	}

	private static int getPrize(int num1, int num2, int num3) {
		if (num1 == num2 && num2 == num3) {
			return 10000 + num1 * 1000;
		}
		if (num1 == num2 || num2 == num3 || num1 == num3) {
			if (num2 == num3) {
				return 1000 + num2 * 100;
			}
			return 1000 + num1 * 100;
		}
		int max = (num1 > num2) ? num1 : num2;
		max = (max > num3) ? max : num3;
		return max * 100;
	}
	
	static int getPrize2(int num1, int num2, int num3) {
		int prize = 0;
		if (num1 == num2 && num2 == num3) {
			prize = 10000 + num1 * 1000;
		} else if (num1 == num2 || num2 == num3 || num1 == num3) {
			if (num2 == num3) {
				prize = 1000 + num2 * 100;
			} else {
				prize = 1000 + num1 * 100;
			}
		} else {
			int max = num1;
			if (max < num2)
				max = num2;
			if (max < num3)
				max = num3;
			prize = max * 100;
		}
		return prize;
	}
}