package ch18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex06_CharacterConvertStream {

	public static void main(String[] args) throws IOException {
		streamWrite("문자 변환 스트림을 사용합니다.");
		String result = streamReader();
		System.out.println(result);
	}

	public static void streamWrite(String str) throws IOException {
		OutputStream os = new FileOutputStream("/temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String streamReader() throws IOException {
		InputStream is = new FileInputStream("/temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		char[] buf = new char[100];
		int num = reader.read(buf);
		reader.close();
		String str = new String(buf, 0, num);
		return str;
	}
}
