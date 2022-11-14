package ch11.sec11_arrays;

import java.util.Arrays;

public class Ex02_Equals {

	public static void main(String[] args) {
		int[] src = {4, 8, 2, 9};
		int[] dst = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.equals(src, dst));
		
		int[][] src2d = {{4, 8}, {2, 9}};
		int[][] dst2d = Arrays.copyOf(src2d, src2d.length);
		System.out.println(Arrays.equals(src2d, dst2d));
		dst2d[0][0] = 1;
		System.out.println(Arrays.equals(src2d, dst2d));
		
		// 2차원 배열, 참조 변수에 대한 배열
		int[][] new2d = Arrays.copyOf(src2d, src2d.length);
		new2d[0] = Arrays.copyOf(src2d[0], src2d[0].length);
		new2d[1] = Arrays.copyOf(src2d[1], src2d[1].length);
		// 배열 번지 비교
		System.out.println(Arrays.equals(src2d, new2d));
		// 배열의 값 비교
		System.out.println(Arrays.deepEquals(src2d, new2d));
		
		new2d[0][0] = 3;
		System.out.println(Arrays.deepEquals(src2d, new2d));
	}

}
