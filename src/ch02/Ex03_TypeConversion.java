package ch02;

public class Ex03_TypeConversion {

	public static void main(String[] args) {
		byte b = 30;
		short c = 300;
		int i = b;		// ���� �� --> ū ���� ��ȯ�� ���� �ڵ����� ��ȯ
		i = c;			// Promotion
		
		short s = (short)i;		// ū �� --> ���� ���� ��ȯ�� ���� ��������� ��ȯ
		
		long l = i;		// int --> long
		float f = l;	// long --> float
		double d = f;	// float --> double
		
		if (s >= -128 && s <= 127) {
			byte bb = (byte)s;
		}
		byte bb = (byte)s;	// ������ �� ���� �߻�
		
		System.out.println(s);
		System.out.println(bb);
		
		i = b + s;
		d = f + l;
		String str = "str" + d;
		// byte -> short -> int -> long -> float -> double -> String
	}

}
