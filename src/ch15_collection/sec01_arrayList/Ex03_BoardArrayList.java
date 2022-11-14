package ch15_collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex03_BoardArrayList {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		// °´Ã¼ Ãß°¡
		for (int i=1; i<=5; i++)
			list.add(new Board("Á¦¸ñ"+i, "³»¿ë"+i, "±Û¾´ÀÌ"+i));
		for (Board b: list)
			System.out.println(b);
		System.out.println();
		
		// ÀúÀåµÈ ÃÑ °´Ã¼¼ö È®ÀÎ
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö: " + size + "\n");
		
		// Æ¯Á¤ °´Ã¼ °¡Á®¿À±â
		Board board = list.get(2);
		System.out.println(board);
		System.out.println();
		
		// °´Ã¼ »èÁ¦
		list.remove(3);
		for (Board b: list)
			System.out.println(b);
	}

}