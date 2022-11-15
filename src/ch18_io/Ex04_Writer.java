package ch18_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex04_Writer {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("/temp/test.txt");
		
		// 1 ���ھ� ���
		char a = 'A', b = 'B';
		writer.write(a);
		writer.write(b);
		
		// char �迭 ���
		char[] arr = {'C', 'D', 'E'};
		writer.write(arr);
		
		// ���ڿ� ���
		writer.write("FGH\n");
		writer.write("�ѱ۵� �� �����ϴ�.");
		
		writer.flush();
		writer.close();
	}

}
