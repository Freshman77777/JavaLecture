package ch06;

public class Ex15_Main {

	public static void main(String[] args) {
		System.out.println(Ex15_Static.pi);
		
		int twoOfTen = Ex15_Static.power(2, 10);
		System.out.println(twoOfTen);
		
		System.out.println(Ex15_Static.circleArea(10.));
		
		// static member�� ��ü�� �����ؼ� ����ϴ� ���� �ٶ������� �ʴ�.
		Ex15_Static st = new Ex15_Static();
		System.out.println(st.pi);
		
		st.x = 10;
		System.out.println(st.power2());
	}

}
