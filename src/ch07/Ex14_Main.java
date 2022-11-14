package ch07;

/**
 * ���� Ÿ�� ��ȯ(Casting)
 */
public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_Parent parent = new Ex14_Parent();
		Son son = new Son();
		Daughter daughter = new Daughter();
		
		parent = son;				// �ڵ� Ÿ�� ��ȯ
		parent.parentMethod();
		
		parent = daughter;
		parent.parentMethod();		// name, parentMethod
		
		/* ���� Ÿ�� ��ȯ - �ùٸ��� ���� ��� */
//		daughter = (Daughter)parent;	// ���� Ÿ�� ��ȯ(Casting)
//		daughter.daughterMethod();
//		
//		son = (Son)parent;			// ClassCastException
//		son.sonMethod();
		
		/* ���� Ÿ�� ��ȯ - �ùٸ� ��� */
		if (parent instanceof Daughter) {	// true
			daughter = (Daughter)parent;
			daughter.daughterMethod();
		}
		if (parent instanceof Son) {		// false
			son = (Son)parent;
			son.sonMethod();
		}
	}

}
