package ch07;

public abstract class Ex22_Animal {
	String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound();
}

class Cow extends Ex22_Animal {
	Cow() {
		this.kind = "��";
	}

	@Override
	public void sound() {
		System.out.println("����~~");
	}
}

class Cock extends Ex22_Animal {
	Cock() {
		this.kind = "��";
	}

	@Override
	public void sound() {
		System.out.println("������~~");
	}
}

// �߻� �޼ҵ带 ������ ���� ������ �߻� Ŭ������ ��
abstract class Bird extends Ex22_Animal {
	Bird() {
		this.kind = "����";
	}
}