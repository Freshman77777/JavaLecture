package ch11.sec03_object;

public class Ex01_EqualsMain {

	public static void main(String[] args) {
		Member member1 = new Member("hong", "ȫ�浿");
		Member member2 = new Member("hong", "ȫ�ڹ�");
		Member member3 = new Member("hong", "ȫ�浿");
		
		// Member���� equals method�� �������ϱ� ����
		System.out.println(member1.equals(member3));	// �Ʒ� ����� ����
		System.out.println(member1 == member3);		// �����ϴ� �ּҰ� �����ĸ� ��
		
		// Member class���� id�� ������ �����ϴٰ� �� ���
		System.out.println(member1.equals(member3));
		System.out.println(member1.equals(member2));
		
		// Member class���� id�� name�� ���ƾ� �����ϴٰ� �� ���
		System.out.println(member1.equals(member3));
		System.out.println(member1.equals(member2));
		
		System.out.println(member1);
		System.out.println(member2);
	}

}
