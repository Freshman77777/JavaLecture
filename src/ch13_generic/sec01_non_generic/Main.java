package ch13_generic.sec01_non_generic;

public class Main {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");					// �ڵ� Ÿ�� ��ȯ
		String name = (String) box.get();	// ���� Ÿ�� ��ȯ
//		String name = null;
//		if (box.get() instanceof String)
//			name = (String) box.get();		// ���� Ÿ�� ��ȯ
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}

}
