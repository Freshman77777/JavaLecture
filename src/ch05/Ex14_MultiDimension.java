package ch05;

import java.util.Arrays;

/**
 * 다차원 배열
 */
public class Ex14_MultiDimension {

	public static void main(String[] args) {
		int[][] matrix = new int[2][3];		// 행의 갯수가 2, 열의 갯수가 3
		int[][] score = { {80, 90, 84}, {78, 85, 95} };		// 학생 2명의 국어/영어/수학 성적
		
		System.out.println(score[0][0]);	// 80
		System.out.println(score[1][1]);	// 85
		
		System.out.println(matrix.length); 	// 2, 행의 갯수
		System.out.println(matrix[0].length); 	// 3, 열의 갯수
		
		for (int i = 0; i < score.length; i++) {
			for (int k = 0; k < score[0].length; k++) {
				System.out.print(score[i][k] + "  ");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(score));		// 도움이 안됨
	}

}