package ch15_collection.sec06_treeSet;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
//		return o1.price - o2.price;				// 가격 오름차순 정렬
//		return o2.price - o1.price;				// 가격 내림차순 정렬
//		return o1.name.compareTo(o2.name);		// 이름 오름차순 정렬
//		return o2.name.compareTo(o1.name);		// 이름 내림차순 정렬
		// 가격, 이름 오름차순
		return (o1.price == o2.price) ? o1.name.compareTo(o2.name) : o1.price - o2.price;
	}
}