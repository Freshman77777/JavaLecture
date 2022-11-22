package mysql.bbs;

import java.time.LocalDateTime;
import java.util.List;

public class BoardTest {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
//		Board board = dao.getBoard(3);
//		board.setBtitle("세번째 글 수정");
//		board.setBcontent("세번째 글을 수정하였습니다.");
//		board.setViewCount(2);
//		dao.updateBoard(board);
		
		dao.incrementViewCount(3);
		int count = dao.getCount();
		System.out.println(count);
		
		List<Board> list = dao.listBoard();
		for (Board b: list)
			System.out.println(b);
		System.out.println();
		
		List<Bbs> bbsList = dao.getBbsList(0);
		for (Bbs b: bbsList)
			System.out.println(b);
//		System.out.println(LocalDateTime.parse("2022-11-21 17:10:09".replace(" ", "T")));
//		System.out.println(LocalDateTime.parse("2022-11-21 17:10:09"));
	}

}