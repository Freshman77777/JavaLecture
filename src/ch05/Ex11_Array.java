package ch05;

import java.util.Arrays;

public class Ex11_Array {

	public static void main(String[] args) {
		int score1 = 80, score2 = 70, score3 = 95, score4 = 68, score5 = 85;
		int sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.;
		System.out.println(avg);
		
		int[] score = {80, 70, 95, 68, 85};
		System.out.println(score[0]);		// ù��° ���
		System.out.println(score[4]);		// ������ ���
		sum = 0;
		for (int i = 0; i < score.length; i++)
			sum += score[i];
		System.out.println((double)sum / score.length);
		
		// �迭�� ���� �� ����
		int[] intArray = new int[] {1, 2, 3, 4, 5};			// �⺻
		double[] doubleArray = {5.2, 2.3, 5.7, 9.2, 4.5};	// �ʱ�ȭ ���� { } �� ����
		String[] strArray = new String[5];		// ������ ���ؼ� �迭�� ����
		
		int a;
		int[] b = new int[3];
//		System.out.println(a); 		// �ʱ�ȭ���� ���� ���� a�� �����ϹǷ� ����
		System.out.println(b[0]);	// �迭�� �⺻������ �ʱ�ȭ��
		
		String s = "ȫ�浿";
		System.out.println(s.length());		// length() method
		System.out.println(score.length);	// length attribute
		
		System.out.println(score);			// �̻��� ��([I@36aa7bc2)�� ��µ�
		System.out.println(Arrays.toString(score));
	}

}