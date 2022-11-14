package ch05;

import java.util.Arrays;
import java.util.Random;

/**
 * �迭�� �� �Ҵ��ϱ�
 */
public class Ex12_Assign {

	public static void main(String[] args) {
		// �ֻ����� 10�� ���� ����� dice �迭�� ����ֱ�
		int[] dice = new int[10];
		Random ran = new Random();
		for (int i = 0; i < dice.length; i++) {
			dice[i] = ran.nextInt(6) + 1;		// nextInt(6) --> [0, 6)
		}
		System.out.println(Arrays.toString(dice));
		
		// �л� 30���� ���� ������ 51 ~ 100 ������ ���� ���Ƿ� ����ְ� ��� ���ϱ�
		int[] score = new int[30];
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = ran.nextInt(50) + 51;
			sum += score[i];
		}
		System.out.println((double)sum / score.length);
		// �� �ٿ� 5���� ������ ��Ÿ������ ���
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%3d", score[i]);
			if ((i + 1) % 5 == 0)
				System.out.println();
			else
				System.out.print(" ");
		}
	}

}