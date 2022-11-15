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
		
		// 파일 생성 및 데이터 저장
		Files.writeString(path, data, Charset.forName("UTF-8"));
		System.out.println();
		
		// 파일 읽기
		String content = Files.readString(path, Charset.forName("UTF-8"));
		System.out.println(content);
		System.out.println();
		
		// 파일 정보 획득
		System.out.println("파일 유형: " + Files.probeContentType(path));
		System.out.println("파일 크기: " + Files.size(path) + " bytes");
		
	}

}
