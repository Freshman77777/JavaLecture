package ch05;

import java.util.Arrays;

/*
 * ���� ����
 * 
 * �ΰ��� ���� ������ Ŀ�ǵ� �ƱԸ�Ʈ�� �Է¹޾�
 * ������� ã�� �� �迭�� �־����.
 */
public class Ex18_Challenge {

	public static void main(String[] args) {
		// Step 1. �ΰ��� ���� ������ �ƱԸ�Ʈ�� �Է¹޾� ���� num1, num2 ������ �ֱ�
		if (args.length != 2) {
			System.out.println("����: �ΰ��� ���� ������ �Է��ϼ���.");
			System.exit(1);
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1 + ", " + num2);
		
		// Step 2. �μ��� ���� ����ŭ for-loop�� ���鼭 num1, num2�� ������������ Ȯ��
		int min = (num1 < num2) ? num1 : num2;
//		for (int i = 1; i <= min; i++) {
//			if (num1 % i == 0 && num2 % i == 0)
//				System.out.println(i);
//		}
		
		// Step 3. ã�� ���� �迭�� �����
		//			1) �迭�� ���� �� ��ŭ�� ũ��� �����.
		//			2) ����2���� �ɷ��� ������� �迭�� �ֱ�
		//			3) ������� ������ŭ ���ο� �迭�� �ֱ�
		int[] tmp = new int[min];
		int index = 0;
		for (int i = 1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				tmp[index++] = i;
		}
		System.out.println(index);
		System.out.println(Arrays.toString(tmp));
		
		int[] commonDivisors = Arrays.copyOf(tmp, index);
		System.out.println(Arrays.toString(commonDivisors));
	}

}