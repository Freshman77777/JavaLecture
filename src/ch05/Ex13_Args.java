package ch05;

import java.util.Arrays;
import java.util.Random;

/**
 * Ŀ�ǵ� ���� �Է�
 */
public class Ex13_Args {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		// Ŀ�ǵ� ���� �Է¿��� 10 ���� ū ������ �Է��ϰ� ����� ����ϱ�
		int num = Integer.parseInt(args[0]);	// ���ڿ� ���ڸ� ������ ��ȯ
		System.out.println(num);
		for (int i = 1; i <= num; i++)
			if (num % i == 0)
				System.out.println(i);
		
		// Ŀ�ǵ� ���� �Է¿��� ���� ���ڸ�ŭ ���� �迭�� ����� �ֻ��� ���� ä���ֱ�
		int[] dice = new int[num];
		Random ran = new Random();
		for (int i = 0; i < dice.length; i++)
			dice[i] = ran.nextInt(6) + 1;
		System.out.println(Arrays.toString(dice));
	}

}