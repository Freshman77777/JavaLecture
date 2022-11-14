package ch15_collection.sec06_treeSet;

public class Person implements Comparable {
	public String name;
	public int age;
	
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Person))
			return 0;
		Person p = (Person) o;
//		return age - p.age;			// ���� �������� ����
//		return p.age - age;			// ���� �������� ����
//		return name.compareTo(p.name);		// �̸� �������� ����
//		return p.name.compareTo(name);		// �̸� �������� ����
		// ����, �̸� ��������
		return (age == p.age) ? name.compareTo(p.name) : age - p.age;
	}
}