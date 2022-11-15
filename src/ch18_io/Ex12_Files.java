package ch18_io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex12_Files {

	public static void main(String[] args) throws IOException {
		String data = "" +
					"id: writer\n" +
					"email: winter@mycompany.com\n" +
					"tel: 010-2345-6789";
		Path path = Paths.get("/temp/user.txt");
		System.out.println(path.toString());
		
		// ���� ���� �� ������ ����
		Files.writeString(path, data, Charset.forName("UTF-8"));
		System.out.println();
		
		// ���� �б�
		String content = Files.readString(path, Charset.forName("UTF-8"));
		System.out.println(content);
		System.out.println();
		
		// ���� ���� ȹ��
		System.out.println("���� ����: " + Files.probeContentType(path));
		System.out.println("���� ũ��: " + Files.size(path) + " bytes");
		
	}

}
