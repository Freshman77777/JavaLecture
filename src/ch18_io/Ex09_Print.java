package ch18_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex09_Print {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/temp/print.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		ps.printf("| %6d | %-10s | %10s |%n", 1, "홍길동", "의적");
		ps.printf("| %6d | %-10s | %10s |%n", 2, "김자바", "학생");
		
		ps.flush();
		ps.close();
	}

}
