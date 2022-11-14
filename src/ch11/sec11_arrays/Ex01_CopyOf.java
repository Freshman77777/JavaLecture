package ch11.sec11_arrays;

import java.util.Arrays;

public class Ex01_CopyOf {

	public static void main(String[] args) {
		char[] src = {'J', 'A', 'V', 'A'};
		
		// ��� 1
		char[] dst = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(dst));
		
		// ��� 2
		dst = Arrays.copyOfRange(dst, 1, 3);
		System.out.println(Arrays.toString(dst));
		
		// ��� 3, �޴� �迭�� �����Ұ� Ȯ���Ǿ�� ��
		char[] newDst = new char[4];
		System.arraycopy(src, 0, newDst, 0, src.length);
		System.out.println(Arrays.toString(newDst));
		
		src[0] = 'j';
		newDst[1] = 'a';
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(newDst));
	}
}
