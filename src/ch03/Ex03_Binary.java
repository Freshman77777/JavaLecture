package ch03;

/**
 * ���� ������
 */
public class Ex03_Binary {

	public static void main(String[] args) {
		int a = 2000000000;
		int b = a * 2;	// int ǥ�� ������ ���
		System.out.println(b);
		System.out.printf("%d, %d%n", Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println(safeAdd(a, a));
		System.out.println(safeAdd(-a, -a));
		System.out.println(safeAdd(a, 100000000));
		
		int c = 3, d = 4;
		int res1 = c / d;		// 0.75, ������� ������ �ް� �ǹǷ� 0�� ��
		System.out.println(res1);
		double res2 = c / d;	// ���� ����� 0, ���Ŀ� �Ǽ� ��ȯ
		System.out.println(res2);
		double res3 = c / (double)d;	// ������ �� �Ǽ� ��ȯ, �ùٸ� ���
		System.out.println(res3);
		System.out.println(4 / 3.);
		
		System.out.println(Double.NaN); 	// 0.0 / 0.0, ����
		System.out.println(Double.POSITIVE_INFINITY); 	// 3.0 / 0.0, �Ҵ�
		System.out.println(3. / 0.);		// Infinity
		
		// �� ������
		System.out.println(3 == 3);
		// �Ǽ� ��
		System.out.println(3.0 == 3.0); 	// �Ǽ����꿡�� �����ĸ� ���ϴ� ���� ������
		System.out.println(Math.abs(3.0 - (1.2+3.3-1.5)) < 1e-15); 	// ������ ���밪�� 1E-15 ���� �۳ķ� ��
		
		// ���ڿ� �� - ���ڿ��� ������
		String str1 = "ȫ�浿";			// ���ͷ��� ���ڿ� �Ҵ�(Heap memory)
		String str2 = "ȫ�浿";
		String str3 = new String("ȫ�浿");		// ���ڿ� ��ü�� ���� �Ҵ�(Stack memory)
		System.out.println(str1 + str2 + str3);
		System.out.println(str1 == str2); 		// �����ϰ� ���ͷ��� ����Ǿ� �ִ� ���� ����Ŵ
		System.out.println(str1 == str3); 		// �ٸ� �����ҿ� �����Ǿ� �־� false
		System.out.println(str1.equals(str3));	// �ùٸ� �� ���
	}
	
	private static int safeAdd(int x, int y) {		// method, �ٸ� ������ �Լ�
		if (x > 0 && y > 0 && y > Integer.MAX_VALUE - x)
			return 0;
		if (x < 0 && y < 0 && y < Integer.MIN_VALUE - x)
			return 0;
		return x + y;
	}
}