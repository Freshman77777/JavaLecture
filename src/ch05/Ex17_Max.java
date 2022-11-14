package ch05;

import java.util.Arrays;
import java.util.Random;

/**
 * 배열에서 최대값/최소값 찾기
 */
public class Ex17_Max {

	public static void main(String[] args) {
		int[] score = new int[30];
		Random ran = new Random();
		for (int i=0; i < score.length; i++)
			score[i] = ran.nextInt(100);
		System.out.println(Arrays.toString(score));
		
		int max = 0;		// int max = score[0];
		for (int i=0; i<score.length; i++) {
			if (score[i] > max)
				max = score[i];
		}
		System.out.println(max);
		
		int min = 100;		// int min = score[0];
		for (int i=0; i<score.length; i++) {
			if (score[i] < min)
				min = score[i];
		}
		System.out.println(min);
	}

}