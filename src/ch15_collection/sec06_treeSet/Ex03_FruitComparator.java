package ch15_collection.sec06_treeSet;

import java.util.TreeSet;

public class Ex03_FruitComparator {

	public static void main(String[] args) {
		TreeSet<Fruit> ts = new TreeSet<>(new FruitComparator());
//		TreeSet<Fruit> ts = new TreeSet<>((o1, o2) -> o1.price - o2.price);
		
		ts.add(new Fruit("Grape", 3000));
		ts.add(new Fruit("Melon", 10000));
		ts.add(new Fruit("Strawberry", 6000));
		ts.add(new Fruit("Banana", 5000));
		
		for (Fruit fruit: ts)
			System.out.println(fruit.name + ": " + fruit.price);
	}

}