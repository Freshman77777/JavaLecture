package exercise;

import java.util.Arrays;

public class Q04_SelfNumber {
	public static final int SELF_NUMBER = 0;
	public static final int NOT_SELF_NUMBER = 1;
	
	public static void main(String[] args) {
		int[] selfNum = new int[100];
		for (int n = 1; n <= 99; n++) {
			int dn = n;
			while (true) {
				dn = dn + dn / 10 + dn % 10;
//				System.out.println(dn);
				if (dn <= 99)
					selfNum[dn] = NOT_SELF_NUMBER;
				if (dn > 100)
					break;
			}
		}
		for (int i = 1; i <= 99; i++) {
			if (selfNum[i] == SELF_NUMBER)
				System.out.println(i);
		}
		System.out.println(Arrays.toString(selfNumber()));
	}

	static int[] selfNumber() {
		int[] selfNum = new int[100];
		for (int n = 1; n <= 99; n++) {
			if (selfNum[n] == NOT_SELF_NUMBER)
				continue;
			int dn = n;
			while (dn <= 99) {
				dn = dn + dn / 10 + dn % 10;
				if (dn <= 99)
					selfNum[dn] = NOT_SELF_NUMBER;
			}
		}
		/* SELF_NUMBER 값으로만 된 배열을 만들기 위한 준비 */
		int count = 0;
		for (int i = 1; i <= 99; i++) {
			if (selfNum[i] == SELF_NUMBER)
				count++;
		}
		/* SELF_NUMBER 값으로만 이루어진 배열 만들기 */
		int[] result = new int[count];
		for (int i = 1, index = 0; i <= 99; i++) {
			if (selfNum[i] == SELF_NUMBER)
				result[index++] = i;
		}
		return result;
	}
}
