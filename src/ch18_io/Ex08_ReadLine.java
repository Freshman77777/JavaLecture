package ch18_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferdeReader - Line ������ ���� ���� �� �ִ�.
 */
public class Ex08_ReadLine {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/temp/test.txt"));
		
		int lineNo = 1;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			System.out.println(lineNo + ":\t" + line);
			lineNo++;
		}
		br.close();
	}

}
