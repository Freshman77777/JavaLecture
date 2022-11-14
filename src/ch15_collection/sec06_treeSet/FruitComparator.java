package ch15_collection.sec06_treeSet;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
//		return o1.price - o2.price;				// ���� �������� ����
//		return o2.price - o1.price;				// ���� �������� ����
//		return o1.name.compareTo(o2.name);		// �̸� �������� ����
//		return o2.name.compareTo(o1.name);		// �̸� �������� ����
		// ����, �̸� ��������
		return (o1.price == o2.price) ? o1.name.compareTo(o2.name) : o1.price - o2.price;
	}
}