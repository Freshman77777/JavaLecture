package ch18_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex09_Print {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/temp/print.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("��ġ ");
		ps.println("�����Ͱ� ����ϴ� ��ó�� ");
		ps.println("�����͸� ����մϴ�.");
		ps.printf("| %6d | %-10s | %10s |%n", 1, "ȫ�浿", "����");
		ps.printf("| %6d | %-10s | %10s |%n", 2, "���ڹ�", "�л�");
		
		ps.flush();
		ps.close();
	}

}
