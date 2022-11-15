package ch18_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex04_Writer {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("/temp/test.txt");
		
		// 1 문자씩 출력
		char a = 'A', b = 'B';
		writer.write(a);
		writer.write(b);
		
		// char 배열 출력
		char[] arr = {'C', 'D', 'E'};
		writer.write(arr);
		
		// 문자열 출력
		writer.write("FGH\n");
		writer.write("한글도 잘 써집니다.");
		
		writer.flush();
		writer.close();
	}

}
