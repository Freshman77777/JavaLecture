package ch07;

public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_Parent parent = new Ex01_Parent();
		Ex01_Child child = new Ex01_Child();
		
		parent.parentInt = 5;
		parent.parentMethod();
		
		child.childInt = 10;
		child.childMethod();
		
		child.parentInt = 30;	// �ڽ��� �θ��� �ʵ尪 ���� ����
		child.parentMethod();	// �ڽ��� �θ��� �޽�� ��� ����
		
		Ex01_Child child2 = new Ex01_Child(200);
		child2.parentMethod();
	}

}