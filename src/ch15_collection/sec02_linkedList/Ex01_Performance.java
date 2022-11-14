package ch15_collection.sec02_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList�� ArrayList ���� ��
 */
public class Ex01_Performance {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		
		// List �տ� �߰��ϴ� ���� ArrayList�� �ð��� �� �ҿ��
		System.out.println("List �տ� �߰��ϴ� ���");
		long startTime = System.nanoTime();
		for (int i=0; i<10000; i++)
			al.add(0, String.valueOf(i));
		long endTime = System.nanoTime();
		System.out.println("ArrayList �ҿ� �ð�:  " + (endTime-startTime) + " nano-sec");
		
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++)
			ll.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList �ҿ� �ð�: " + (endTime-startTime) + " nano-sec");
		
		System.out.println("\nList �ڿ� �߰��ϴ� ���");
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++)
			al.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("ArrayList �ҿ� �ð�:  " + (endTime-startTime) + " nano-sec");
		
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++)
			ll.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList �ҿ� �ð�: " + (endTime-startTime) + " nano-sec");
	}

}